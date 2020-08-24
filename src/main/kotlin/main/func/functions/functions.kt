package main.func.functions

fun main() {
    greeter("lambogini")
    println("Volume is ${volume(10,5)}")
    println("VolumeX is ${volumeX(width = 7, height = 10)}")

}

//fun greeter(name: String): String {
//    return "Hello $name"
//}

// we can convert a function with a single line and returns the value into expression body
// we change the opening curly brace to an "=" sign and delete the return keyword and closing curly brace "}"
//fun greeter(name: String): String = "Hello $name"
fun greeter(name: String) = "Hello $name"

// calculate the volume of rectangular prism
//fun volume(length: String, width: String, height: String): String = "Volume of prism = ${length * width * height}"

fun volume(length: Int, width: Int, height: Int = 10) = length * width * height

fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height