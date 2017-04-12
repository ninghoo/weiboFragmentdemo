package com.ninghoo.beta.myapplication2.Interface;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ninghoo.beta.myapplication2.Constant.CWConstant;
import com.ninghoo.beta.myapplication2.Utils.CWUrls;
import com.ninghoo.beta.myapplication2.Utils.LogUtils;
import com.ninghoo.beta.myapplication2.Utils.SPUtils;
import com.ninghoo.beta.myapplication2.WeiboModel.BaseNetWork;
import com.ninghoo.beta.myapplication2.WeiboModel.HttpResponse;
import com.ninghoo.beta.myapplication2.WeiboModel.ParameterKeySet;
import com.ninghoo.beta.myapplication2.WeiboModel.StatusEntity;
import com.sina.weibo.sdk.net.WeiboParameters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ningfu on 17-4-12.
 */

public class HomePresenterImp implements HomePresenter {
    private String url = CWUrls.HOME_TIME_LINE;
    private int page = 1;
    WeiboParameters mParameters;
    private SPUtils mSPUtils;
    private List<StatusEntity> mEntityList;
    private HomeView mHomeView;

    public HomePresenterImp(HomeView homeView) {
        mHomeView = homeView;
        mEntityList = new ArrayList<>();
        mSPUtils = SPUtils.getInstance(mHomeView.getActivity());
        mParameters = new WeiboParameters(CWConstant.APP_KEY);
    }

    public void loadData() {
        page = 1;
        loadData(false);
    }

    public void loadMore() {
        page++;
        loadData(true);
    }

    public void requestHomeTimeLine() {
        url = CWUrls.HOME_TIME_LINE;
        loadData();
    }

    public void requestUserTimeLine() {
        url = CWUrls.USER_TIME_LINE;
        loadData();
    }

    private void loadData(final boolean loadMore) {
        new BaseNetWork(mHomeView.getActivity(), url) {
            public WeiboParameters onPrepare() {
                mParameters.put(ParameterKeySet.AUTH_ACCESS_TOKEN, mSPUtils.getToken());
                mParameters.put(ParameterKeySet.PAGE, page);
                mParameters.put(ParameterKeySet.COUNT, 3);
                return mParameters;
            }

            public void onFinish(HttpResponse response, boolean success) {
                if (success) {
                    LogUtils.d(response.response);
                    Type type = new TypeToken<ArrayList<StatusEntity>>() {
                    }.getType();
                    List<StatusEntity> list = new Gson().fromJson(response.response, type);
                    if (!loadMore) {
                        mEntityList.clear();
                    }
                    mEntityList.addAll(list);
                    mHomeView.onSuccess(mEntityList);
                } else {
                    mHomeView.onError(response.message);
                }
            }
        }.get();

    }

}
