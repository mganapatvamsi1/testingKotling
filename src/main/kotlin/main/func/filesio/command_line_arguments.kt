package main.func.filesio

fun main(args: Array<String>) {

    if(args.any()) {
        println("first string = ${args[0]}")
    }
    println()
    for(arg in args) {
        println(arg)
    }

}