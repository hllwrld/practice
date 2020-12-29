package com.hllwrld.kotlingramma

import SharedreferenceExt
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test = TestSharedPreference()
        test.name = "joy"
        test.age = 20
    }


   inner class TestSharedPreference {
        var age:Int by SharedreferenceExt(this@MainActivity, "", 0, "test")
        var name:String by SharedreferenceExt(this@MainActivity, "", "", "test")
    }
}