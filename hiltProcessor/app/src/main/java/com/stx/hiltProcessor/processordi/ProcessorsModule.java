package com.stx.hiltProcessor.processordi;


import com.stx.hiltProcessor.annotation.BindOKHttp;
import com.stx.hiltProcessor.annotation.BindVolley;
import com.stx.hiltProcessor.annotation.BindXUtils;
import com.stx.hiltProcessor.processors.IHttpProcessor;
import com.stx.hiltProcessor.processors.OkHttpProcessor;
import com.stx.hiltProcessor.processors.VolleyProcessor;
import com.stx.hiltProcessor.processors.XUtilsProcessor;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttp;

@Module
@InstallIn(SingletonComponent.class)
public abstract class ProcessorsModule {

    @BindOKHttp
    @Binds
    @Singleton
    abstract IHttpProcessor bindOkHttp(OkHttpProcessor okHttpProcessor);

    @BindVolley
    @Binds
    @Singleton
    abstract IHttpProcessor bindVolley(VolleyProcessor volleyProcessor);

    @BindXUtils
    @Binds
    @Singleton
    abstract IHttpProcessor bindXUtils(XUtilsProcessor xUtilsProcessor);

}
