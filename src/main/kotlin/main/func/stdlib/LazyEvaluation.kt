package main.func.stdlib

fun main(args: Array<String>) {

    val elements = 1..1000000000

//    val output = elements.asSequence().filter { it < 31 }
//        .map { Pair("YES", it) }
//        .forEach { println(it) }
//    println()
    //why is the bottom not getting displayed when the top is also printed along with it.
    val outputSum = elements.asSequence().take(30).sum()
    println(outputSum)
    println()
    val numbers = generateSequence(2) { x -> x + 10 }
    println(numbers.take(30).sum())

    val lazyInit: Int by lazy { 100 }

}