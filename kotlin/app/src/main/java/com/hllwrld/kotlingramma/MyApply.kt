package com.hllwrld.kotlingramma



inline fun  <T> T.myApply(action:T.()->Unit): T {
    action()
    return this;
}

fun main() {
    "aaaaa".myApply {
        println(this)
    }.myApply {
        println(this.length)
    }

}