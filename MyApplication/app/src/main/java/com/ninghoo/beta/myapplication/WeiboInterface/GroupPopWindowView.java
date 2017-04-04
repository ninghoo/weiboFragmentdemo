package com.ninghoo.beta.myapplication.WeiboInterface;

import com.ninghoo.beta.myapplication.WeiboModel.Group;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-5.
 */

public interface GroupPopWindowView {

    /**
     * 将网络请求返回的数据，添加到ListView上,需要返回返回
     */
    public void updateListView(ArrayList<Group> datas);


    /**
     * Toast显示网络请求失败的错误信息
     *
     * @param error
     */
    public void showErrorMessage(String error);
}