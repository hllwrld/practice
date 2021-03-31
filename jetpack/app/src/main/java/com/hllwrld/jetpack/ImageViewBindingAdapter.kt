package com.hllwrld.jetpack

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


    @BindingAdapter("image")
    fun setImage(imageView: ImageView, url: String) {
        Log.d("homeTest", "glide called:${url}")
        Glide.with(imageView).load(url).into(imageView);
    }