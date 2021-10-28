package com.hllwrld.kotlingramma

import java.io.File
import java.lang.StringBuilder

interface Element {
    fun run(stringBuilder: StringBuilder, indent:String);
}

open class Tag(val tag:String):Element {

    val  mElements:ArrayList<Element> = ArrayList()
    val mAttributes:HashMap<String,String> = HashMap()

    override fun run(stringBuilder: StringBuilder, indent: String) {

    }


}


class TextElement(val mContent:String) :Element{

    override fun run(stringBuilder: StringBuilder, indent: String) {
       stringBuilder.append("$indent$mContent\n")
    }
}

class Html:Tag("html") {


    override fun toString(): String {
        // TODO: 2021/10/16
    }

    fun head(action:Head.()->Unit) {

    }

    fun body(action: Body.()->Unit){

    }

}

class H1:OperatorElement("h1") {}
class P:OperatorElement("p"){

}
class A:OperatorElement("a"){
    var href:String?
        get() {
           return mAttributes["href"]
        }
        set(value:String?) {
            value?.let {
                mAttributes["href"]=it
            }
        }

}

class Body:Tag("body") {
    fun h1(action:H1.()->Unit){
        val h1Object = H1()
        h1Object.action()
        mElements+=h1Object
    }

    fun p(action:P.()->Unit){
        val pObejct= P()
        pObejct.action()
        mElements+=pObejct
    }
    fun a(href:String, action:A.()->Unit){
       val aObject = A()
       aObject.action()
       mElements+=aObject
    }
}

class Title:OperatorElement("title") {

}

class Head:Tag("head") {

    fun title(action:Title.()->Unit){
        val titleObject = Title()
        titleObject.action()
       mElements+= titleObject
    }
}



fun html(action:Html.()->Unit):Html{
    val htmlObj = Html();
    htmlObj.action()
    return htmlObj
}

open class OperatorElement(name:String) :Tag(name) {
   operator fun String.unaryMinus(){
       mElements.add(TextElement(this))
   }
    operator fun String.unaryPlus(){
        mElements.add(TextElement(this))
    }

}

class P :OperatorElement("p") {

}

fun main() {

    val names = listOf("Derry1", "Derry2", "Derry3") // 集合

    val result =
        html { // this == 第一个中转站 { head body 。。 }
            head { // this == head中转站 { title }
                title { +"使用 Kotlin 进行 HTML 编码" }
            }
            body { // this == body中转站 { h1 p a p }
                h1 { // this == h1中转站 { 未知 }
                }
                p { -"此格式可用作 HTML 的替代标记" }

                // 具有属性和文本内容的元素
                a(href = "http://bbs.xiangxueketang.cn/pins/recommended") { -"享学论坛" }

                // 混合内容
                p {
                    -"Derry老师来了"
                    -"文本。有关更多信息，请参阅"
                    a(href = "http://www.xiangxueketang.cn/") { -"湖南享学" }
                    -"Derry的项目"
                }
                p { -"一些文字" }

                // 从命令行参数生成的内容
                p {
                    -"命令行参数是："
                }
            }
        }
    println(result)
    val file = File("DDD.html")
    file.writeText(result.toString())

}