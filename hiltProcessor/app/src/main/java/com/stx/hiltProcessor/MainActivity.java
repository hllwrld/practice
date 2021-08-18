package com.stx.hiltProcessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.stx.hiltProcessor.annotation.BindOKHttp;
import com.stx.hiltProcessor.processors.HttpCallback;
import com.stx.hiltProcessor.processors.IHttpProcessor;

import org.xutils.view.annotation.Event;

import java.util.HashMap;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void click(View view) {
        Log.d("homeTest", "onClick");
        String url = "https://v.juhe.cn/historyWeather/citys";
        HashMap<String, Object> params = new HashMap<>();
        //https://v.juhe.cn/historyWeather/citys?&province_id=2&key=bb52107206585ab074f5e59a8c73875b
        params.put("province_id", "2");
        params.put("key", "bb52107206585ab074f5e59a8c73875b");
        ((MyApplication)getApplication()).getIHttpProcessor().post(url, params, new HttpCallback<ResponceData>() {
            @Override
            public void onSuccess(ResponceData objResult) {
                Toast.makeText(MainActivity.this, objResult.getResultcode(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}