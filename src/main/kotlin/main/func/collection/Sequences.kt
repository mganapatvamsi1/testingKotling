package main.func.collection

/**
 * Sequences require a terminal operation to start working, if there isn't one they won't do anything
 */
fun main() {
    val result = (100 until 200)
        .map { println("doubling $it"); it * 2 }.first { println("filtering $it"); it % 3 == 0 }
    println("results = $result")
    println()

    println()
    val sequenceResult = (100 until 200).asSequence()
        .map { println("doubling $it"); it * 2 }
        .first { println("filtering $it"); it % 3 ==  0 }
    println("sequenceResult = $sequenceResult")
    println()

    println()
    val myThrees = sequenceOf(1,3,5,7,9,11,13,15).filter { it % 3 == 0 }
    println("myThrees = $myThrees")
    println(myThrees.toList())
    val firstFiltered = sequenceOf(1,3,5,7,9,11,13,15).first { it % 3 == 0 }
    println("firstFiltered = $firstFiltered")



}