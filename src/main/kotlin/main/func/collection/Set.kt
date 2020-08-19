package main.func.collection

fun main() {
    val setOfThrees = setOf(3, 3, 3, 3, 3, 3)
    println(setOfThrees)
    println("size = ${setOfThrees.size}")
    println("Has a 4 ? ${setOfThrees.contains(4)}")
    println("Has a 2 ? ${setOfThrees.contains(2)}")
    println()

    val setNames = mutableSetOf(1, 3, 5, 7, 9, 9, 9, 11, 11, 13, 13)
    println(setNames)
    val setNames1 = mutableSetOf(1, 3, 5, 7, 9, 11, 13)
    println(setNames1)
    val setNamesTwo = mutableSetOf(1, 3, 5, 7, 9, 13, 11)
    println(setNamesTwo)
    println("Is this equal?? ${setNames ==setNames1}")
    println()

    val setNamesTwo3 = mutableSetOf(11, 13, 9, 7, 5, 3, 1)
    println(setNamesTwo3)
    println("firsts equal? ${setNamesTwo.first() == setNamesTwo3.first()}")
    println("setNamesTwo == setNamesTwo3? ${setNamesTwo == setNamesTwo3}")
    println()

    val hashSet = hashSetOf(1, 2, 3, 4, 5, 6)
    val hashSet2 = hashSetOf(6, 5, 4, 3, 2, 1)
    println("firsts equal in hashset? ${hashSet.first() == hashSet2.first()}")
    println("hashSet == hashSet2? ${hashSet == hashSet2}")
    println()

    println("added 7? ${hashSet2.add(7)}")
    println("removed 55? ${hashSet2.remove(55)}")
    println()

    val setToList = setNames.toList()
    println("setToList = $setToList")
    val setToMutableList = setNames.toMutableList()
    println("setToMutableList = $setToMutableList")

}