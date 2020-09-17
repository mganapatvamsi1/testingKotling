package main.func.kotlinio

data class Money(val amount: Int? = 0, val currency: String? = "")


fun sendPayment(money: Money): Unit {
    println("Sending ${money.amount}${money.currency}")
}

fun main() {
    val tickets = Money(100, "$")
//    tickets.amount = 200 // results into compilation
    val popcorn = tickets.copy(5000, "Rupees")
//    println("tickets = $tickets")
//    println("popcorn = $popcorn")
    sendPayment(tickets)
    if (tickets != popcorn) {
        println("They are different!")
    } else {
        println("Same")
    }




}