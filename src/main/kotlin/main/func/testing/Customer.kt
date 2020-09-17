package main.func.testing

import java.util.*

class Customer(var id: Int? = 0, var name: String, var message: String, val yearOfBirth: Int) {
//        init {
//        name = name.toUpperCase()
//        message = message.toUpperCase()
//    }
    val age: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var ssn: String = ""
    set(value) {
        if (!value.startsWith("81")) {
            throw IllegalArgumentException("SSN should start with 81..")
        }
        field = value
    }



    //TODO: need to look into this secondary constructor
//    constructor(name: String, message: String): this(0, "", "") {
//        name.toUpperCase()
//        message.toUpperCase()
//    }

}

fun main(args: Array<String>) {

    val customer = Customer(10, "raj", "finally getting into it",1992)
    println(customer.id)
    println(customer.name)
    println(customer.message)
    println(customer.age)
    println(customer.ssn)

}