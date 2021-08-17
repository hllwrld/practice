package com.stx.hilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.stx.hilt.di.HttpObject;
import com.stx.hilt.di.TestInterface;
import com.stx.hilt.di.TestInterfaceObject;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button mBtn;

    @OnClick(R.id.btn)
    public void onClick() {
        Log.d("homeTest", "onClick");
        startActivity(new Intent(this, SecondActivity.class));
    }

    @Inject
    HttpObject mHttpObject;

    @Inject
    HttpObject mHttpObject1;

    @Inject
    TestInterface mTestInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d("homeTest",mHttpObject.hashCode()+":1");
        Log.d("homeTest",mHttpObject1.hashCode()+":2");
        mTestInterface.method();
    }


}