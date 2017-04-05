package com.ninghoo.beta.myapplication.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ninghoo.beta.myapplication.WeiboUtils.SharedPreferencesUtil;
import com.ninghoo.beta.myapplication.WeiboUtils.StatusBarUtils;

/**
 * Created by ningfu on 17-4-5.
 */

//public class BaseActivity extends SwipeBackActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getSwipeBackLayout().setSwipeMode(SwipeBackLayout.FULL_SCREEN_LEFT);
//        getSwipeBackLayout().setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
//        getSwipeBackLayout().setSensitivity(BaseActivity.this, 0.3f);
//        boolean setNightMode = (boolean) SharedPreferencesUtil.get(this, "setNightMode", false);
//        if (!setNightMode) {
//            StatusBarUtils.from(this)
//                    .setTransparentStatusbar(true)
//                    .setStatusBarColor(Color.parseColor("#FFFFFF"))
//                    .setLightStatusBar(true)
//                    .process(this);
//        }else {
//            StatusBarUtils.from(this)
//                    .setTransparentStatusbar(true)
//                    .setStatusBarColor(Color.parseColor("#262626"))
//                    .setLightStatusBar(true)
//                    .process(this);
//        }
//
//    }
//}

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSwipeBackLayout().setSwipeMode(SwipeBackLayout.FULL_SCREEN_LEFT);
//        getSwipeBackLayout().setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
//        getSwipeBackLayout().setSensitivity(BaseActivity.this, 0.3f);
        boolean setNightMode = (boolean) SharedPreferencesUtil.get(this, "setNightMode", false);
        if (!setNightMode) {
            StatusBarUtils.from(this)
                    .setTransparentStatusbar(true)
                    .setStatusBarColor(Color.parseColor("#FFFFFF"))
                    .setLightStatusBar(true)
                    .process(this);
        }else {
            StatusBarUtils.from(this)
                    .setTransparentStatusbar(true)
                    .setStatusBarColor(Color.parseColor("#262626"))
                    .setLightStatusBar(true)
                    .process(this);
        }

    }
}