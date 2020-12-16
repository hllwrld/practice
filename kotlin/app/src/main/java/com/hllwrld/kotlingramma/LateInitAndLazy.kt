package com.hllwrld.kotlingramma


class TestLazy() {

    val a : Int by lazy {
        println("lazy called")
        5 *6
    }
}


class TestLate {
    lateinit var a: String
}

fun main() {

    val testLazy = TestLazy();
    val testLate = TestLate();

    println("testLazy:${testLazy.a}")
    //println("testLate:${testLate.a}")
}