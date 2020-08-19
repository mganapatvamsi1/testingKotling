package main.func.collection

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val  set = setOf(10, 20, 30, 40, 50)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30, 4 to 40)

    val transformedList = list.map { it * 2 }
    println("tList = $transformedList")

    val transformedMap = map.map { Pair(it.key, it.value * 10) }.toMap()
    println("transformedMap = $transformedMap")

    println()
    val oddFilteredList = list.filter { it % 2 == 1 }
    println("oddFilteredList = $oddFilteredList")

    val filterSet = set.filter { it > 100 }
    val filterSet1 = set.filter { it >= 50 }
    println("is filterSet empty? ${filterSet.isEmpty()}")
    println()
    println("filterSet1 $filterSet1")
    println("sort set in descending = ${set.sortedDescending()}")
    println()

    println("transformedList last element = ${transformedList.last()}")
    println("tList last lambda = ${transformedList.last { it > 15 } }")
    println()
    println("transformedList first element = ${transformedList.first()}")
    println("tList first lambda = ${transformedList.first { it > 1 } }")
}