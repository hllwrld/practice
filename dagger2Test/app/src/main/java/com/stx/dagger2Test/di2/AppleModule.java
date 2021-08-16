package com.stx.dagger2Test.di2;


import com.stx.dagger2Test.scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppleModule {

    @AppScope
    @Provides
    public AppleObject providerAppleOject() {
        return new AppleObject();
    }
}
