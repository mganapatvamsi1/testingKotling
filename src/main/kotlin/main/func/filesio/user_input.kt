package main.func.filesio

import java.util.*

fun main() {
    println("Enter text: ")
    val text = readLine()  // ?: ""
    println("You entered: $text, length = ${text?.length}")
    println()

    print("\nEnter an integer value: ")
    val text1 = readLine() ?: ""
    println("You entered: $text, length = ${text1.length}")
//    val intValue: Int = text1.toInt()
//    println("intValue = $intValue")
    val intValue2: Int = text1.toIntOrNull() ?: 0
    println("You entered: $intValue2")
    println()

    print("\nEnter a double value: ")
    val text2 = readLine() ?: ""
    val dValue: Double = text2.toDoubleOrNull() ?: 0.0
    println("You entered: $dValue")

    scanner()



}

fun scanner() {
    println()

    val scan = Scanner(System.`in`)
    print("Enter an integer number: ")
    val number1 = scan.nextInt()
    println()

    print("Enter a double number: ")
    val number2 = scan.nextDouble()
    println()

    println("First input number = $number1")
    println("Second input number = $number2")


}