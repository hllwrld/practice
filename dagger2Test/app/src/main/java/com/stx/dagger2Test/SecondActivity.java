package com.stx.dagger2Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.stx.dagger2Test.di.DaggerMainComponent;
import com.stx.dagger2Test.di.DatabaseObject;
import com.stx.dagger2Test.di.HttpObject;
import com.stx.dagger2Test.di2.AppleObject;
import com.stx.dagger2Test.di2.DaggerAppleComponent;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    DatabaseObject mDatabaseObject;

    @Inject
    HttpObject mHttpObject;

    @Inject
    AppleObject mAppleObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getMainComponent().injectSecondActivity(this);
        Log.d("homeTest", mDatabaseObject.hashCode() + "  sec:database");
        Log.d("homeTest", mHttpObject.hashCode() + "  sec:http");
        Log.d("homeTest", mAppleObject.hashCode() + "  sec:apple");

    }
}