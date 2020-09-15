package main.func.inheritance

/* Interface can't have state but abstract class does. */
interface CustomerRepository {
    val isEmpty: Boolean
    get() = true

    fun store(obj: Customer) {

    }
    fun getById(id: Int): Customer
}

class SqlCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }
    override val isEmpty: Boolean
    get() = false
}

interface I1 {
    fun fullFun() {
        println("full fun with I1")
    }
}

interface I2 {
    fun fullFun() {
        println("full fun with I2")
    }
}

class Class1And2: I1, I2 {
    override fun fullFun() {
       // println("our own")
        super<I2>.fullFun()
    }
}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.fullFun()

}