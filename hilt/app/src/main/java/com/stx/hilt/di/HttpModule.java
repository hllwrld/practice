package com.stx.hilt.di;


import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.components.SingletonComponent;

@InstallIn(ActivityComponent.class)
@Module
public class HttpModule {


    @Provides
    @ActivityScoped
    public HttpObject providerHttpObject() {
        return new HttpObject();
    }

}
