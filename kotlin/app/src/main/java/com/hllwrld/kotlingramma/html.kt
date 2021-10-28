package com.hllwrld.kotlingramma
/*

import java.io.File

interface Node {
    fun render(): String
}

class HtmlNode(val name: String) : Node {

    val properties = HashMap<String, Any>()
    val children = ArrayList<Node>()

    override fun render(): String {
        return """<$name ${properties.map { "${it.key}='${it.value}'" }.joinToString(" ")}>${children.joinToString(""){ it.render() }}</$name>"""
    }

    operator fun String.invoke(block: HtmlNode.() -> Unit) {
        val node = HtmlNode(this)
        node.block()
        this@HtmlNode.children += node
    }

    operator fun String.invoke(string: String) {
        this@HtmlNode.properties.put(this, string)
    }

    operator fun String.unaryPlus() {
        this@HtmlNode.children+= HtmlNode(this)
    }
}


fun HtmlNode.head(block: HtmlNode.() -> Unit) {
    val node = HtmlNode("head")
    node.block()
    this.children+=node
}

fun HtmlNode.body(block: HtmlNode.() -> Unit){
    val node = HtmlNode("body")
    node.block()
    this.children+=node
}

fun html(block: HtmlNode.() -> Unit): Node {
    val htmlNode = HtmlNode("html")
    htmlNode.block()
    return htmlNode
}



fun main() {
    val htmlContent = html {
        head {
            "meta" {
                "charset"("UTF-8")
            }
        }
        body {
            "div" {
                "style"(
                    """
                    width: 200px; 
                    height: 200px; 
                    line-height: 200px; 
                    background-color: #C9394A;
                    text-align: center
                    """.trimIndent()
                )
                "span" {
                    "style"(
                        """
                        color: white;
                        font-family: Microsoft YaHei
                        """.trimIndent()
                    )
                    +"Hello HTML DSL!!"
                }
            }
        }
    }.render()

    File("Kotlin.html").writeText(htmlContent)
}

*/
