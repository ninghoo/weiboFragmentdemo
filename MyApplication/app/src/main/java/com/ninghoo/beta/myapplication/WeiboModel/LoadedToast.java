package com.ninghoo.beta.myapplication.WeiboModel;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ninghoo.beta.myapplication.R;

/**
 * Created by ningfu on 17-4-4.
 */

public class LoadedToast extends Toast {

    private static final int DEFAULT_OFFSET_X = 0;
    private int mDefault_offset_y;

    private static LoadedToast mLoadedToast;
    private static TextView mTvMsg;

    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     */
    private LoadedToast(Context context, String msg) {
        super(context);
        // toast settings
        mDefault_offset_y = (int) context.getResources().getDimension(R.dimen.dp_45);
        View mToastView = LayoutInflater.from(context).inflate(R.layout.loaded_toast, null, true);
        mTvMsg = (TextView) mToastView.findViewById(R.id.toast_msg);
        mTvMsg.setText(msg);
        //mToastView.getLayoutParams().height = mDefault_offset_y;

        setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, DEFAULT_OFFSET_X, mDefault_offset_y);
        setDuration(Toast.LENGTH_SHORT);
        setView(mToastView);
    }


    public static void showToast(Context context, String msg) {
        if (mLoadedToast == null) {
            mLoadedToast = new LoadedToast(context.getApplicationContext(), msg);
        } else {
            mTvMsg.setText(msg);
        }
        mLoadedToast.show();
    }
}