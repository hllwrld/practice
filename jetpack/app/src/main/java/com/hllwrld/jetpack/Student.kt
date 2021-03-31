package com.hllwrld.jetpack

import androidx.databinding.ObservableField

internal class Student {
    val age:Int = 18
    val name:String =  "aaa";

    val nameObservableFiled:ObservableField<String> = ObservableField(name)


}