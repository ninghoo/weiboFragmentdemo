package com.ninghoo.beta.myapplication.WeiboInterface;

import android.content.Context;

/**
 * Created by ningfu on 17-4-5.
 */

public interface TokenListModel {

    public interface OnTokenSwitchListener {
        void onSuccess();

        void onError(String error);

    }


    public void addToken(Context context, String token, String expiresIn, String refresh_token, String uid);

    public void deleteToken(Context context, String uid);

    public void switchToken(Context context, String uid);

    public void switchToken(Context context, int positonInCache, OnTokenSwitchListener onTokenSwitchListener);


}