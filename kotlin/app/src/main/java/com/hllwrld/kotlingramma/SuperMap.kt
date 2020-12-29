package com.hllwrld.kotlingramma

import android.util.ArrayMap


class SuperArrayMap<V>(
    var map: MutableMap<Any, V> = HashMap(),
    var list: MutableList<V?> = ArrayList()
) : MutableMap<Any, V> by map, MutableList<V?> by list {


    override fun clear() {
        map.clear();
        list.clear();
    }

    override fun isEmpty(): Boolean {
        return map.isEmpty() && list.isEmpty()
    }

    override val size: Int
        get() {
            return map.size + list.size
        }

    override fun set(index: Int, element: V?): V? {
        if (list.size <= index) {
            repeat(index - list.size + 1) {
                list.add(null)

            }
        }
        return list.set(index, element)
    }

    override fun toString(): String {
        return "SuperArrayMap(map=$map, list=$list)"
    }


}


fun main() {

    val superArray = SuperArrayMap<String>()
    val superArray2 = SuperArrayMap<String>()
    superArray += "Hello"
    superArray["Hello"] = "World"
    superArray2[superArray] = "World"

    superArray[1] = "world"
    superArray[4] = "!!!"

    println(superArray)
    println(superArray2)


}