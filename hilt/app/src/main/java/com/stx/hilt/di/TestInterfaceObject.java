package com.stx.hilt.di;

import android.util.Log;

import javax.inject.Inject;

public class TestInterfaceObject implements TestInterface {

    @Inject
    TestInterfaceObject(){}

    @Override
    public void method() {
        Log.d("homeTest", "TestInterfaceObject called");

    }
}
