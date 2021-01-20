package com.hllwrld.kotlingramma

typealias OnConfirm = () -> Unit
typealias OnCancel = () -> Unit

private val EmptyFunction = {}

open class Notification(
        val title: String,
        val content: String
)

class ConfirmNotification(
        title: String,
        content: String,
        val onConfirm: OnConfirm,
        val onCancel: OnCancel
) : Notification(title, content)

class ConfirmNotificationBuilder {
    fun title(String): {

    }
}


fun main() {
    ConfirmNotificationBuilder()
            .title("Hello")
            .onCancel {
                println("onCancel")
            }.content("World")
            .onConfirm {
                println("onConfirmed")
            }
            .build()
            .onConfirm()
}
