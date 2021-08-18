package com.stx.hiltProcessor;

import android.app.Application;

import com.stx.hiltProcessor.annotation.BindOKHttp;
import com.stx.hiltProcessor.annotation.BindXUtils;
import com.stx.hiltProcessor.processors.IHttpProcessor;

import javax.inject.Inject;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MyApplication extends Application {

    @BindOKHttp
    @Inject
    IHttpProcessor mIHttpProcessor;


    @Override
    public void onCreate() {
        super.onCreate();

    }

    public IHttpProcessor getIHttpProcessor() {
        return mIHttpProcessor;
    }
}
