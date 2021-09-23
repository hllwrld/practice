package com.hllwrld.kotlingramma



inline fun <T> T.myTakeIf(action:T.()->Boolean) :T?= if(action(this)) this else null

fun main() {

    val ret = "DDDD".myTakeIf { false}
    println(ret)
}