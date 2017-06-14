package com.bwie.wuxiaofang.yunlliinfo.view.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.bwie.wuxiaofang.yunlliinfo.R;
import com.bwie.wuxiaofang.yunlliinfo.view.fragemnt.LoginFragment;
import com.bwie.wuxiaofang.yunlliinfo.view.fragemnt.StateFragment;
import com.bwie.wuxiaofang.yunlliinfo.view.fragemnt.UploadFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout framlayout;
    private LoginFragment loginFragment;
    private UploadFragment uploadFragment;
    private StateFragment stateFragment;
    private android.support.v4.app.FragmentManager fragmentManager;
    private android.support.v4.app.FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setDefaultFragment();


    }

    private void setDefaultFragment() {

        loginFragment = new LoginFragment();
        uploadFragment = new UploadFragment();
        stateFragment = new StateFragment();

        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.framlayout, loginFragment)
                .add(R.id.framlayout, uploadFragment)
                .add(R.id.framlayout, stateFragment)
                .hide(uploadFragment)
                .hide(stateFragment);
        transaction.commit();
    }

    private void initView() {
        framlayout = (FrameLayout) findViewById(R.id.framlayout);
    }
}
