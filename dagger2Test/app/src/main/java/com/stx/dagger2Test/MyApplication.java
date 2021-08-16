package com.stx.dagger2Test;

import android.app.Application;

import com.stx.dagger2Test.di.DaggerMainComponent;
import com.stx.dagger2Test.di.MainComponent;
import com.stx.dagger2Test.di2.DaggerAppleComponent;

public class MyApplication extends Application {

    private MainComponent mDaggerMainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mDaggerMainComponent =
                DaggerMainComponent.builder()
                        .appleComponent(DaggerAppleComponent.create())
                        .build();
    }

    public MainComponent getMainComponent() {
        return mDaggerMainComponent;
    }
}
