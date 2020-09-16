package main.func.functional

fun outsideFunction() {

//    val number  = 10
    for (number in 1..30) {
        unaryOperation(20) { x ->
            println(number)
            x * number
        }
    }


}

fun main(args: Array<String>) {
    outsideFunction()

}

// extend a class or type, without have to inherit from it