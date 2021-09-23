package com.hllwrld.kotlingramma

fun  button(action: () -> Unit) {}

fun text(action: () -> Unit) {

}

fun layout(action:()->Unit) {

}

fun main() {

    layout {
        button {

        }

        text{

        }


    }

}