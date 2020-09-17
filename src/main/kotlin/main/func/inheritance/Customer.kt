package main.func.inheritance

open class Person {
    open fun validate() {
        println("Parent validate")
    }
}

open class Customer : Person {
    override fun validate() {
        println("primary constructor")
    }
    constructor(): super() {
        println("secondary")
    }
}

data class Cst(val name: String, val id: Int): Customer()

fun main() {
    val customer = Customer()
    println(customer.validate().toString())

}