package com.ninghoo.beta.myapplication.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.ninghoo.beta.myapplication.R;
import com.ninghoo.beta.myapplication.WeiboModel.AccessTokenKeeper;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ningfu on 17-4-5.
 */

public class WelcomeActivity extends Activity {
    private Intent mStartIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);

//        if (AccessTokenKeeper.readAccessToken(this).isSessionValid()) {
//            mStartIntent = new Intent(WelcomeActivity.this, MainActivity.class);
//        } else {
            mStartIntent = new Intent(WelcomeActivity.this, UnLoginActivity.class);
//        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                mHandler.sendMessage(Message.obtain());
            }
        }, 500);
    }


    public Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            startActivity(mStartIntent);
            finish();
        }
    };

    @Override
    protected void onDestroy() {
        mHandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
