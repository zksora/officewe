package com.zksora.officewe.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.zksora.officewe.R;

/**
 * Created by Administrator on 2018/1/5.
 */

public class SplashActivity extends BaseActivity {
    private int time = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
              Intent it = new Intent();
              it.setClass(SplashActivity.this, MainActivity.class);
              startActivity(it);
                finish();
            }
        }, 1000 * time);
    }
}
