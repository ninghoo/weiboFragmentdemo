package com.ninghoo.beta.myapplication.WeiboInterface;

import android.content.Context;

import com.ninghoo.beta.myapplication.WeiboModel.Group;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-5.
 */

public interface GroupListModel {

    interface OnGroupListFinishedListener {
        void noMoreDate();

        void onDataFinish(ArrayList<Group> groupslist);

        void onError(String error);
    }


    public void groupsOnlyOnce(Context context, OnGroupListFinishedListener onDataFinishedListener);

    public void cacheLoad(Context context, OnGroupListFinishedListener onGroupListFinishedListener);

    public void cacheSave(Context context, String response);


}