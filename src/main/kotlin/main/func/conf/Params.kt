package main.func.conf

data class Params(var firstName: String, var lastName: String)

fun main() {
    val person1: Params? = null

    val test: String? = null

    val greeting: String? = "Hey, i am finally learning kotlin"
    if (greeting != null) {
        println("Mani says: $greeting")
    }
    println("Greeting length = ${greeting?.length}")

    val leng = greeting?.length ?: 0
    println("Length = $leng")

    // val badLength = test!!.length // never to use this "!!" --> this means we are telling kotlin to let us do what we want
    // println("Value of badLength is: $badLength")

    // safe cast --> returns null if its not able to cast

    val safeGreeting: String? = greeting as? String
    println("value of safeGreet: $safeGreeting")
    val safeTest: String? = test as? String
    println("value of safeTest: $safeTest")
}
