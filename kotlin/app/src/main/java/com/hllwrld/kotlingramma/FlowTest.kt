package com.hllwrld.kotlingramma

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.system.measureTimeMillis
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime


fun getData(): Flow<Int> = flow {

        log("getData")

        for (i in 1..10) {
            log("emit on")
            delay(100)
            emit(i)
        }
}.onCompletion {

        cause -> cause?.let { println(cause) }
    println("onCompletion")

}

fun getStringData():Flow<String> = flowOf("one", "two", "three")

fun log(msg:String) = println("[${Thread.currentThread().name}], $msg")

/*
suspend fun  getData(num:Int) = flow<String> {
    emit("$num,aa")
    delay(100)
    emit("$num,bb")
}
*/

fun main(): Unit = runBlocking{

/*
    val time =  measureTimeMillis {

        getData().zip(getStringData()) {

                a,b -> "$a -> $b"

        }.collect { println(it) }
    }

    println("time ${time}")
*/



/*
    (1..5).asFlow() .onEach {  }.flatMapConcat { getData(it) }.collect {
        println(it)
    }
*/

/*
    val time = measureTimeMillis {
        getData().buffer().collect {
            delay(200)
            println(it)
        }
    }

    println("use time ${time}")
*/






/*
    val result = (1..10).asFlow().map { it * it }.reduce{a,b -> a+ b}
    println(result)
*/

   // getData().collect { println(it) }


/*
    launch {
        (1..10).asFlow().transform {
            emit("haha $it")
            delay(100)
            emit("hehe $it")
        }.collect { print(it) }

    }
*/

/*
    launch {
        withContext(Dispatchers.IO) {
            for (i in 10..20) {
                delay(100)
                println(i)
            }
        }
    }
*/


/*
    launch {
        withTimeoutOrNull(480) {
            getData().collect { println(it) }
        }
    }
*/


}
