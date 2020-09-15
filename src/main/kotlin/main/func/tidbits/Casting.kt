package main.func.tidbits

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 30) {
            println("We need more vacation")
        }
    }
}

class Contractor: Person() {

}

fun hasVacations(obj: Person) {
//    if (obj is Employee) {
//        obj.vacationDays(25)
//    }
    // safe access expression
    (obj as? Employee)?.vacationDays(25)
}

var input: Any = 10
var output: Any = 17

// safeCast: Regular casts may result into a ClassCastException if the object is not of the target type. Another option is to use safe casts that return null if the attempt was not successful:
//example: val aInt: Int? = a as? Int --> safe cast

fun main(args: Array<String>) {
    //safe cast
    val str = input as String
    println(str.length)
}