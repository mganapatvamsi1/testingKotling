package main.func.collection

fun main() {
    val personNames = listOf("Mani", "Vamsi", "Raj", "Aryan", "Malhotra")

    println("person names = $personNames")
    println("first person name = ${personNames.get(0)}")
    println("second person name = ${personNames[1]}")

    val subList = personNames.subList(1, 5)
    println(subList)

    val items = mutableListOf(2, 4, 6, 8, 10, 10, 10, 12, 14, 11, 9, 3, 7, 5, 5)
    items[0] = 1
    items.add(12)
    items.removeAt(3)
    items.remove(99)
    println("items = $items")
    println("There are ${items.size} items.")
    println("The first item is ${items.first()}")
    println("The second item is ${items[1]}")

    val listToSet =items.toSet()
    println("listToSet = $listToSet")
    val listToSortedSet =items.toSortedSet()
    println("listToSortedSet = $listToSortedSet")
    println()

    val animals = listOf("apple", "biscuit","apple",
        "cat","cat", "cat","dog", "elephant","fox", "goat","elephant")
    println("animals = $animals")
    val animalListToSet = animals.toSet()
    println("animalListToSet = $animalListToSet")

}