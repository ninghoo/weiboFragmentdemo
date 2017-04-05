package com.ninghoo.beta.myapplication.WeiboInterface;

import android.content.Context;

/**
 * Created by ningfu on 17-4-5.
 */

public interface AccoutActivityPresent {

    public void logoutCurrentAccout(Context context);

    public void logout(Context context, String uid);

    public void switchAccout(Context context, String uid);

    public void obtainUserListDetail(Context context);

}
