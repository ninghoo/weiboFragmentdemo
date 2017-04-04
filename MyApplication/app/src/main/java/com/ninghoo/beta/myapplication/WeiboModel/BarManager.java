package com.ninghoo.beta.myapplication.WeiboModel;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

import com.ninghoo.beta.myapplication.R;

/**
 * Created by ningfu on 17-4-5.
 */

public class BarManager {

    private Animation showAnim;
    private Animation dismissAnim;

    public BarManager(Context applicatonContext) {
        showAnim = AnimationUtils.loadAnimation(applicatonContext, R.anim.bottombar_show);
        dismissAnim = AnimationUtils.loadAnimation(applicatonContext, R.anim.bottombar_dismiss);
    }

    public void hideAllBar(View topBar, View bottomBar) {
        hideTopBar(topBar);
        hideBottomBar(bottomBar);
    }

    public void showAllBar(View topBar, View bottomBar) {
        showTopBar(topBar);
        showBottomBar(bottomBar);
    }

    public void showTopBar(final View topBar) {
        topBar.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));
    }

    public void hideTopBar(final View topBar) {
        topBar.animate().translationY(-topBar.getHeight()).setInterpolator(new AccelerateInterpolator(2));
    }

    /**
     * 显示工具栏
     */
    public void showBottomBar(final View bottomBar) {
        bottomBar.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();
    }

    /**
     * 隐藏工具栏
     */
    public void hideBottomBar(final View bottomBar) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) bottomBar.getLayoutParams();
        int fabBottomMargin = lp.bottomMargin;
        bottomBar.animate().translationY(bottomBar.getHeight() + fabBottomMargin).setInterpolator(new AccelerateInterpolator(2)).start();
    }
}
