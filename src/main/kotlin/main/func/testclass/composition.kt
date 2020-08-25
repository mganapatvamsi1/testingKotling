package main.func.testclass

interface IWorker {
    val jobTitle: String
    fun trackHours(hours: Double)
    fun doWork()
}

interface IBeing {
    val firstName: String
    fun getName(): String
}

class Worker(override val jobTitle: String) : IWorker {
    private var totalHours = 0.0

    override fun trackHours(hours: Double): Unit {
        totalHours += hours
    }

    override fun doWork() {
        println("Doing ${this.jobTitle} work.")
    }
}

class Being(override val firstName: String) : IBeing {
    override fun getName(): String {
        return firstName
    }
}

interface IPayment {
    fun calcPay(): Double
}

class HourlyPay(val hourlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return hourlyRate
    }
}

class SalariedPay(val yearlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return yearlyRate
    }
}

class EmployeeNew(worker: Worker, being: Being, pay: IPayment) :
    IWorker by worker, IBeing by being, IPayment by pay {
}

class noPay(): IPayment {
    override fun calcPay(): Double {
        return 0.0
    }
}

fun main() {
    val hourly = EmployeeNew(
        Worker("Consultant"),
        Being("ManiG"),
        HourlyPay(50.55)
    )
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = EmployeeNew(
        Worker("Engineer"),
        Being("RamK"),
        SalariedPay(100000.00)
    )
    println("My name is ${salaried.getName()}")
    salaried.doWork()

    val rescueDog = EmployeeNew(
        Worker("Engineer"),
        Being("RamK"),
        noPay()
    )
    println("My name is ${rescueDog.getName()}")
    rescueDog.doWork()

}