package main.func.classes

 abstract class Person(val firstName: String, val ssn: String) {
    abstract fun getName(): String
}

open class Employee(
    firstName: String,
    ssn: String,
    val jobTitle: String,
    val hourlyRate: Double
) : Person(firstName, ssn) {

    var totalHours= 0.0

    override fun getName(): String {
        return firstName
    }

    fun trackHours(hours: Double) {
        totalHours += hours
    }

    fun doWork() {
        println("Doing ${this.jobTitle} work")
    }
}

class Salaried(
    firstName: String,
    ssn: String,
    jobTitle: String,
    val monthlySalary: Double
): Employee(
    firstName,
    ssn,
    jobTitle,
    0.0
) {}


fun main() {
    val hourly = Employee(
        "chotuu",
        "888-44-1986",
        "Consulting Analyst",
        43.10
    )
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = Salaried(
        "RajAryan",
        "111-22-3333",
        "Programmer Analyst",
        1.23
    )
    println("My name is ${salaried.getName()}")
    salaried.doWork()
}