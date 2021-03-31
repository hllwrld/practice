package com.hllwrld.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hllwrld.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main);
        activityMainBinding.student = Student()
        activityMainBinding.eventHandler= EventHandler(this)
        activityMainBinding.netImage = "http://goo.gl/gEgYUd"
    }
}