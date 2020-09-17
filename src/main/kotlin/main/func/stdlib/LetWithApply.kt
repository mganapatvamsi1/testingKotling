package main.func.stdlib

import java.io.File

fun main(args: Array<String>) {
    val file = File("input.txt")
    with(file) {

    }

    val str: String? = "Some Value"
    str?.let {
        println(it.length)
    }
}