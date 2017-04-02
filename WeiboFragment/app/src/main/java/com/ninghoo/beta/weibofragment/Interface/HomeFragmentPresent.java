package com.ninghoo.beta.weibofragment.Interface;

/**
 * Created by ningfu on 17-4-2.
 */
import android.content.Context;

/**
 * Created by wenmingvs on 16/5/14.
 */
public interface HomeFragmentPresent {

    public void refreshUserName(Context context);

    public void firstLoadData(Context context, boolean firstStart);

    public void pullToRefreshData(long groupId, Context context);

    public void requestMoreData(long groupId, Context context);

    public void cancelTimer();

}
