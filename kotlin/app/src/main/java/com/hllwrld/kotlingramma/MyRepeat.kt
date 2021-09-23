package com.hllwrld.kotlingramma

inline fun myRepeat(count:Int, action:(Int)->Unit) {
    for(item in 0..count) action(item)
}


fun main() {

    myRepeat(20) {
        println("count: $it")
    }

}