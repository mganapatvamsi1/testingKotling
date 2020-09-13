package main.func.testing

object Global {
    const val PI = 3.14
    const val speed_of_light = 299
}

fun main(args: Array<String>) {
    val localObject = object {
        val PI = 3.1414145
        val speed_of_light = 301
    }
    println(Global.PI)
    println(localObject.PI)
}