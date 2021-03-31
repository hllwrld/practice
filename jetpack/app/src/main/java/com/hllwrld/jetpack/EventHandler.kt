package com.hllwrld.jetpack

import android.content.Context
import android.view.View
import android.widget.Toast

class EventHandler (val mContext: Context){

    fun onClick(view: View) {
       Toast.makeText(mContext, "onClick", Toast.LENGTH_LONG).show()
    }

}