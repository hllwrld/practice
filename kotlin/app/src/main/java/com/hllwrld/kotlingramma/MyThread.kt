package com.hllwrld.kotlingramma



inline fun myThread(

    start: Boolean = true,
    name:String? = null,
    crossinline action:()->Unit
) {

    val thread = object : Thread() {
        override fun run() {
            action()
        }
    }

    if(start) thread.start()

    name?.let { thread.name = name }


}

fun main() {

    myThread { println("hahhahha : ${Thread.currentThread()}") }
}