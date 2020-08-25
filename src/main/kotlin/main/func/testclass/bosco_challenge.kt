package main.func.testclass

class Bosco {
    companion object {
        private var count = 0
        fun increment() {
            count++
        }

        fun show() {
            println("$count instances created.")
        }
    }

    init {
        increment()
    }
}

fun nop() {
    val b = Bosco()
}


fun main() {
    val b1 = Bosco()
    Bosco.show()
    println()
    val b2 = Bosco()
    Bosco.show()
    nop()
    println()
    Bosco.show()
    println()
    val b3 = Bosco()
    Bosco.show()

}