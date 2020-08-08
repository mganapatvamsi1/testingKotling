package main.func.loops

fun main() {
    var cardPoints = 7000

    val cardLevel: String = if (cardPoints >= 0 && cardPoints < 1000) {
        "Its a pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5000) {
        "time comes to silver"
    } else if (cardPoints >= 5000 && cardPoints < 10000) {
        "its gold"
    } else {
        "Won with Platinum"
    }

    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")

}