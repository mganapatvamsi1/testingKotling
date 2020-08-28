package main.func.testclass

class Create constructor(val message: String) {
    fun showMessage() {
        println(message)
    }
    // A class can only have 1 companion object, trying to add more is a compile time error.
    companion object {
        const val Speed = 999999
        fun fac(message: String): Create {
            return Create(message)
        }
    }
}

class CantCreate private constructor(val message: String) {
    fun showMessage() {
        println(message)
    }
    // A class can only have 1 companion object, trying to add more is a compile time error.
    companion object {
        const val Light_Speed = 299_792_458
        fun privateFactory(message: String): CantCreate {
            return CantCreate(message)
        }

        fun samplePrint(self: CantCreate) {
            println("Accessing ${self.message}")
        }
    }

}

fun main() {
    val create = Create("I am able to access this as the constructor as its public")
    val createCompanion = Create.fac("public constructor method")
    createCompanion.showMessage()
    println("Speed is: ${Create.Speed} km/s")
    println()

//    val CantCreate = CantCreate("I am able to access this as the constructor as its public") // this would throw a compile time error as the constructor is private
    val cantCreateCompanion = CantCreate.privateFactory("private constructor")
    cantCreateCompanion.showMessage()
    CantCreate.samplePrint(cantCreateCompanion)
    println("The speed of light is: ${CantCreate.Light_Speed} m/s")
}