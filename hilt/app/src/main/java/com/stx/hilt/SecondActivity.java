package com.stx.hilt;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.stx.hilt.di.HttpObject;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SecondActivity extends ComponentActivity {

    @Inject
    HttpObject mHttpObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_activity_main);
        Log.d("homeTest", "sec-"+mHttpObject.hashCode());
    }
}
