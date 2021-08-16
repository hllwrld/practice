package com.stx.dagger2Test.di2;


import com.stx.dagger2Test.scope.AppScope;

import dagger.Component;

@AppScope
@Component(modules = {AppleModule.class})
public interface AppleComponent {
   public AppleObject provideAppleObject();
}
