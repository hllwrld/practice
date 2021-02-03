package com.hllwrld.kotlingramma

import android.os.Build

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

interface SelfType<T> {
    val self:T
        get() {
            return this as T
        }
}

open class NotificationBuilder<T > : SelfType<T>{
    protected var title:String = ""
    protected var content:String=""

    fun title(title:String): T {
       this.title = title
       return self
    }

    fun content(content: String): T{
        this.content = content
        return self
    }

    open fun build(): Notification {
        return Notification(title, content)
    }
}


class ConfirmNotificationBuilder: NotificationBuilder<ConfirmNotificationBuilder>() {

    var onCancel = EmptyFunction
    var onConfirm = EmptyFunction


    override fun build():ConfirmNotification {
        return ConfirmNotification(title, content, onConfirm, onCancel)
    }

    fun onCancel(onCancel: OnCancel): ConfirmNotificationBuilder{
        this.onCancel = onCancel
        return this
    }

    fun onConfirm(onConfirm: OnConfirm): ConfirmNotificationBuilder{
        this.onConfirm = onConfirm
        return this
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
