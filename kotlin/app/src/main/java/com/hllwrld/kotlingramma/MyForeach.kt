package com.hllwrld.kotlingramma


inline fun <T> Iterable<T>.myForeach(action:(T)->Unit) = run { for (item in this) action(item) }

fun main() {
    listOf(111,222,333).myForeach {
        println(it)
    }

}