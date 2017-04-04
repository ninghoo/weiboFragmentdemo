package com.ninghoo.beta.myapplication.WeiboView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ningfu on 17-4-2.
 */

public class EmojiTextView extends TextView {


    private final Context mContext;

    public EmojiTextView(Context context) {
        super(context, null);
        mContext = context;
    }

    public EmojiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

}
