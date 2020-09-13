package main.func.testing

fun throwingExceptions(): Nothing {
    throw Exception("returns something")
}

fun printDetails(name: String = "", email: String, phone: String = "") {
    println("name: $name - email: $email - phone: $phone")

}

fun main(args: Array<String>) {
//    val capitals = listOf("newYork", "SanFransisco", "LosAngeles", "Chicago", "Seattle")
//    for (capital in capitals) {
////        println(capital)
//    }
//    val state = "Missouri"
//
//    when (state) {
//        "Missouri" -> println("Finally, got it..!")
//        "others" -> println("I lost it")
//    }
//
//    println("calling: ${throwingExceptions()}")

    printDetails(email = "cv@test.com")


}