package main.func.tidbits

import java.io.BufferedReader
import java.io.FileReader

// base class for Exceptions in kotlin is Throwable
class NotANumberException(message: String) : Throwable(message) {

}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number..!")

    }
}

fun main(args: Array<String>) {
//    throw NotANumberException()
//    try {
//        checkIsNumber('G')
//    } catch (e: IllegalArgumentException) {
//        println("Don't do anything")
//    } catch (e: NotANumberException) {
////        println("It's not a number..!")
//        println("${e.message}")
//    }

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try {
        val char = CharArray(30)
        buffer.read(char, 0, 35)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception has been handled")
//        println("${e.message}")
        -1
        -3
    } finally {
        println("closing")
        buffer.close()
        -10
    }
    println(result)

    // try-catch blocks in kotlin can be treated as expressions and return values.

}