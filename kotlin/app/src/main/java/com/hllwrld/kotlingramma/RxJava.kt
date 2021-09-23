package com.hllwrld.kotlingramma

/*
class Helper<T> (var item:T)
fun <T,R> Helper<T>.map(action: T.()->R) = Helper(action(item))
fun <T> Helper<T>.consumer(action: T.() -> Unit)= action(item)
fun <R> create(action:()->R) = Helper(action())
*/

class Helper<T> (val item:T)
fun <R> create(action:()->R) = Helper(action())
fun <T,R> Helper<T>.map(action:T.()->R) = Helper(action(item))
fun<T> Helper<T>.consumer(action:T.()->Unit) = action(item)



fun main() {
    create {
        "aaaaaaa"
    }.map {
        length
    }.map {
        "length is $this"
    }.consumer {
        println("consumer $this")
    }
}