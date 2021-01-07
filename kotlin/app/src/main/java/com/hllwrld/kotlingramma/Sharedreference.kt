package com.hllwrld.kotlingramma

import android.content.Context
import android.content.SharedPreferences
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class SharedreferenceExt<T>(val mContext: Context, val mName: String, val defalutValue: T, val preferenceName: String = "preference") : ReadWriteProperty<Any?, T> {


    private val pref: SharedPreferences by lazy { mContext.getSharedPreferences(preferenceName, Context.MODE_PRIVATE) }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putSharedPreference(mContext, getKey(property), value)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return getSharedPreference(mContext, getKey(property))
    }

    fun getKey(property: KProperty<*>) :String {
        return if (mName.isEmpty()) property.name else mName
    }

    fun putSharedPreference(context: Context, key: String, value: T) {
        with(pref.edit()) {
            when (value) {
                is String -> putString(key, value)
                is Long -> putLong(key, value)
                is Int -> putInt(key, value)
                is Float -> putFloat(key, value)
                else -> throw RuntimeException("unsupport type")
            }
        }.apply()
    }

    fun getSharedPreference(context: Context, key: String): T {
        return when (defalutValue) {
            is String -> pref.getString(key, defalutValue)
            is Long -> pref.getLong(key, defalutValue)
            is Int -> pref.getInt(key, defalutValue)
            is Float -> pref.getFloat(key, defalutValue)
            else -> throw RuntimeException("unsupport type")
        } as T
    }

}

