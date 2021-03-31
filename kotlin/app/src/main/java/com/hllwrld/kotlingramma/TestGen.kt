package com.hllwrld.kotlingramma

open internal class Food1
open internal class Frute1 : Food1()
open internal class Apple1 : Frute1()
internal class Hongfushi1 : Apple1()


internal class GenericTypein<in T: Frute1> {
    fun put(t:T)  {}
}


internal class GenericTypeOut<out T: Frute1> {
    fun get():T {
        TODO()
    }
}

internal  fun print(param:GenericTypein<Apple1>) {}

fun main() {
  //  val gen = GenericTypein<>()
    //val gen1 = GenericTypeOut<Apple1>()
}
