package com.stx.dagger2Test.di;


import com.stx.dagger2Test.MainActivity;
import com.stx.dagger2Test.SecondActivity;
import com.stx.dagger2Test.di2.AppleComponent;
import com.stx.dagger2Test.scope.UserScope;


import dagger.Component;

@UserScope
@Component(modules = {DatabaseModule.class, HttpModule.class}, dependencies = {AppleComponent.class})
public interface MainComponent {

    public void injectMainActivity(MainActivity mainActivity);
    public void injectSecondActivity(SecondActivity secondActivity);
}
