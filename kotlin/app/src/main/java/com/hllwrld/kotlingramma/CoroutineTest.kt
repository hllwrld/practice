package com.hllwrld.kotlingramma

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext


class LoginRepository {

    suspend fun query () {

        println("before query in :${Thread.currentThread().name}")
        withContext(Dispatchers.IO) {
            println("query in :${Thread.currentThread().name}")
            delay(2000)
        }
        println("after query in :${Thread.currentThread().name}")
    }
}

class LoginViewModel(val mLoginRepository: LoginRepository)   {


     fun login() {
         runBlocking {
             println("before query:${Thread.currentThread().name} ")
            mLoginRepository.query()
             println("after query:${Thread.currentThread().name} ")
         }
         println("after block:${Thread.currentThread().name} ")
     }
}


/*
fun main() {

    runBlocking() {

            println("bbbbbbb")

        withContext(Dispatchers.IO) {

            println("cccccccc")
        }

        println("ddddddd")

        withContext(Dispatchers.IO) {

            println("eeeeee")
        }
        println("ffffff")

    }

    println("aaaaaaa")
}

*/
