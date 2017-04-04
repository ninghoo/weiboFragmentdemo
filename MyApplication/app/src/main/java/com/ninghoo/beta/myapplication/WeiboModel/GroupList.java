package com.ninghoo.beta.myapplication.WeiboModel;

import android.text.TextUtils;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-5.
 */

public class GroupList {
    /**
     * 分组列表
     **/
    public ArrayList<Group> lists;
    /**
     * 分组数目
     **/
    public int total_number;

    public static GroupList parse(String jsonString) {
        if (TextUtils.isEmpty(jsonString)) {
            return null;
        }

        GroupList groupList = new Gson().fromJson(jsonString, GroupList.class);
        return groupList;

    }
}