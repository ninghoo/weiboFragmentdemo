package com.ninghoo.beta.myapplication.WeiboModel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.ninghoo.beta.myapplication.R;

/**
 * Created by ningfu on 17-4-4.
 */

public class HomeHeadView extends RelativeLayout {

    public HomeHeadView(Context context) {
        super(context);
        init(context);
    }

    public HomeHeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HomeHeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context) {
        inflate(context, R.layout.headview_homefragment, this);
    }
}
