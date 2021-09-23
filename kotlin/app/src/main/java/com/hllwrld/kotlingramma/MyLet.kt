package com.hllwrld.kotlingramma


fun <T,R> T.myLet(action:(T)->R): R = action(this)

fun main() {

    val temp = "aaaa".myLet {
       it.length
    }.apply { println(this) }

}