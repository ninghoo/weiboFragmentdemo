package com.ninghoo.beta.myapplication.WeiboInterface;

import com.ninghoo.beta.myapplication.WeiboModel.User;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-5.
 */

public interface AccoutActivityView {
    public void updateListView(ArrayList<User> userArrayList);

    public void showListView();

    public void hideListView();

    public void showProgressDialog();

    public void hideProgressDialog();

    public void setUpListener();

    public void initListView(ArrayList<User> userArrayList);

    public void finishItself();
}
