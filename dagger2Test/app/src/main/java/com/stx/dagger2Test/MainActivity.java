package com.stx.dagger2Test;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.stx.dagger2Test.di.DatabaseObject;
import com.stx.dagger2Test.di.HttpObject;
import com.stx.dagger2Test.di2.AppleObject;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    DatabaseObject mDatabaseObject;

    @Inject
    HttpObject mHttpObject;

    @Inject
    AppleObject mAppleObject;

    @BindView(R.id.btn)
    Button mButton;

    @OnClick(R.id.btn) void onclick() {
        startActivity(new Intent(this, SecondActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getMainComponent().injectMainActivity(this);

        ButterKnife.bind(this);
        Log.d("homeTest", mDatabaseObject.hashCode() + ":database");
        Log.d("homeTest", mHttpObject.hashCode() + ":http");
        Log.d("homeTest", mAppleObject.hashCode() + ":apple");

    }
}