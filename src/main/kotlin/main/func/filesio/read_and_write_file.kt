package main.func.filesio

import java.io.File

fun main() {
    val resource = "./resources"
    val pets = "pets.txt"
    val petFile = File("${resource}/$pets")

    val file = File("${resource}/text.txt")
    file.forEachLine { println(it) }
    println()

    val writeFile = File("$resource/write.txt")
    writeFile.writeText("Kotlin = happiness")

    val petList = listOf("cat", "dog", "rat", "bat", "bird")
    petFile.writeText("")
    petList.forEach { petFile.appendText("$it\n") }

    val newPets = mutableListOf<String>()
    petFile.forEachLine { newPets.add(it) }
    println()
    println("newPets = $newPets")
    println()

    val exists = petFile.exists()
    println("\npets exists? $exists")

}