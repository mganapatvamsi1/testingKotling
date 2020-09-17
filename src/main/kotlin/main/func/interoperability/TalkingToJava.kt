package main.func.interoperability

fun main(args: Array<String>) {
    val customerJava = CustomerJava()

    customerJava.email = "rajaryan@malhotra.com"

    println(customerJava.prettyPrint())


}