package com.example.pangxiezi.single;

import android.app.Application;

import com.example.pangxiezi.single.utils.FrescoHelper;


public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FrescoHelper.getInstance().init(this);
    }
}
