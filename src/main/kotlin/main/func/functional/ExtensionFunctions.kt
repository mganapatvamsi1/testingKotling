package main.func.functional

fun String.hey() {
    println("It's me.!")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {it.capitalize()}
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") {"$prefix ${it.capitalize()}"}
}

class CustomerPrac {
    fun makePreferred() {
        println("normal version")
    }
}

fun CustomerPrac.makePreferred() {
    println("extended version")
}


fun main(args: Array<String>) {
    "Hello".hey()
    val str = "Another one"
    str.hey()
    println()
    println("this is just a sample text to title case it for making it look good".toTitleCase())
    println("normal simple text with some attachment to it".toTitleCase("Pivot--"))
    println()

    val instance: BaseClass = InheritedClass()
    instance.extension()
}

open class BaseClass

class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}


