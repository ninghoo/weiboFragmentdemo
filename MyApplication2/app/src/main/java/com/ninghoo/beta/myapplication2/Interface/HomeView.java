package com.ninghoo.beta.myapplication2.Interface;

import com.ninghoo.beta.myapplication2.WeiboModel.StatusEntity;

import java.util.List;

/**
 * Created by ningfu on 17-4-11.
 */

public interface HomeView extends BaseView
{
    Void onSuccess(List<StatusEntity> list);
}
