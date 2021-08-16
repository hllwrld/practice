package com.stx.dagger2Test.di;


import com.stx.dagger2Test.scope.UserScope;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpModule {


    @Provides
    public HttpObject providerHttpObject() {
        return new HttpObject();
    }
}
