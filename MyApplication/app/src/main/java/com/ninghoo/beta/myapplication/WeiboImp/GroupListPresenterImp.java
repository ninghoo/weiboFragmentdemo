package com.ninghoo.beta.myapplication.WeiboImp;

import android.content.Context;

import com.ninghoo.beta.myapplication.WeiboFragment.HomeFragmentView;
import com.ninghoo.beta.myapplication.WeiboInterface.GroupListModel;
import com.ninghoo.beta.myapplication.WeiboInterface.GroupListPresenter;
import com.ninghoo.beta.myapplication.WeiboInterface.GroupPopWindowView;
import com.ninghoo.beta.myapplication.WeiboModel.Group;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-5.
 */

public class GroupListPresenterImp implements GroupListPresenter {

    private GroupPopWindowView mGroupPopView;
    private GroupListModel mGroupListModel;
    private HomeFragmentView mHomeFragmentView;

    public GroupListPresenterImp(GroupPopWindowView groupPopView) {
        this.mGroupPopView = groupPopView;
        this.mGroupListModel = new GroupListModelImp();
    }

    @Override
    public void updateGroupList(final Context context) {
        mGroupListModel.groupsOnlyOnce(context, new GroupListModel.OnGroupListFinishedListener() {
            @Override
            public void noMoreDate() {

            }

            @Override
            public void onDataFinish(ArrayList<Group> groupslist) {
                mGroupPopView.updateListView(groupslist);
            }

            @Override
            public void onError(String error) {
                mGroupPopView.showErrorMessage(error);
            }

        });
    }


}
