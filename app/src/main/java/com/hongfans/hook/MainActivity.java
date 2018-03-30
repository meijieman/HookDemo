package com.hongfans.hook;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hongfans.common.log.SL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);

        SL.i("onCreate");
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        SL.i("attachBaseContext");
        HookHelper.hookActivityManager();
        HookHelper.hookPackageManager(this);
    }

    @Override
    public void onClick(View v) {
        SL.i("onClick " + v.getId());
        switch (v.getId()) {
            case R.id.btn_1:

                break;
            case R.id.btn_2:

                break;
            default:

                break;
        }
    }
}
