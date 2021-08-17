package com.stx.hilt.di;


import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@InstallIn(ActivityComponent.class)
@Module
public abstract class TestInterfaceModule {

    @Binds
    public abstract TestInterface abc(TestInterfaceObject testInterfaceObject);
}
