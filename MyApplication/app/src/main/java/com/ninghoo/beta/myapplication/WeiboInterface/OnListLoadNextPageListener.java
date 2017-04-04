package com.ninghoo.beta.myapplication.WeiboInterface;

import android.view.View;

/**
 * Created by ningfu on 17-4-5.
 */

public interface OnListLoadNextPageListener {

    /**
     * 开始加载下一页
     *
     * @param view 当前RecyclerView/ListView/GridView
     */
    public void onLoadNextPage(View view);
}
