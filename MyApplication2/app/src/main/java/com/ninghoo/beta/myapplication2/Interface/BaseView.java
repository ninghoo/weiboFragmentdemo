package com.ninghoo.beta.myapplication2.Interface;

import android.app.Activity;

/**
 * Created by ningfu on 17-4-11.
 */

public interface BaseView
{
    Activity getActivity();
    void onError(String error);
}
