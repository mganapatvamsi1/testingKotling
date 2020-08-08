package main.func.loops

fun main() {
    var cardPoints = 11000

    val cardLevel: String = when (cardPoints) {
        in 0..999 -> "Its a pearl"
         in 1000..4999 -> "time comes to silver"
         in 5000..9999 -> "its gold"
       else -> "Platinum"
    }
    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")

}