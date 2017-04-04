package com.ninghoo.beta.myapplication.WeiboInterface;

import android.content.Context;

import com.ninghoo.beta.myapplication.WeiboModel.Status;
import com.ninghoo.beta.myapplication.WeiboModel.User;

/**
 * Created by ningfu on 17-4-3.
 */

public interface WeiBoArrowPresent2 {

    public void weibo_destroy(long id, Context context, int position, String weiboGroup);

    public void user_destroy(User user, Context context);

    public void user_create(User user, Context context);

    public void createFavorite(Status status, Context context);

    public void cancalFavorite(int position, Status status, Context context, boolean deleteAnimation);

    //public void cancalFavorite(int position, Status status, Context context);

}
