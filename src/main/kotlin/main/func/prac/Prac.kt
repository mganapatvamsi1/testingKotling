package main.func.prac
fun main(args: Array<String>) {
    var x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or 4")
    }
    val card = CardCategory.Spade
    val cardType = when (card) {
        CardCategory.Diamond, CardCategory.Heart -> println("Red Card")
        CardCategory.Club, CardCategory.Spade -> println("Black Card")
    }
    val name = "Troy"
    val lastname = when (name) {
        "Virat" -> "Kohli"
        "Troy" -> "Miles"
        else -> {
            "Unknown"
        }
    }
    println("$name $lastname")

    val ageType = when (x) {
        in 0..1 -> "baby"
        in 2..4 -> "toddler"
        in 5..12 -> "kid"
        in 13..19 -> "teenager"
        in 20..64 -> "adult"
        else -> "senior"
    }
    println("You are a $ageType")
}

internal enum class CardCategory {
    Club, Spade, Diamond, Heart
}