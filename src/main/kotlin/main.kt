package main.kotlin

fun returnNothing() {
    println("main.kotlin.main.func.services.func.returnNothing() function")
}

fun main() {
    string()
    prac()
    ifCond()
}

fun ifCond() {
    val bigger = 101
    var smaller = 4
    //    val max = bigger > smaller ? bigger : smaller // terinary operators won't work in kotlin
    val max = if (bigger > smaller) bigger else smaller
    println("$max")

    if (bigger > 0) {
        println("$bigger")
    } else if (bigger <= 0) {
        println("$smaller")
    }

    val number = 21
//    val isGreater = if (number > 30) true else false
    val isGreater = number > 30
    println("number = $isGreater")
    val criteria: Any =
        if (number > 100) {
            "alpha"
        } else if (number > 90) {
            println("greater than 90 but less than 100")
            9
        } else if (number > 80) {
            println("greater than 80 but less than 90")
            8
        } else if (number > 70) {
            println("greater than 70 but less than 80")
            7
        } else if (number > 60) {
            println("greater than 60 but less than 70")
            6
        } else if (number > 50) {
            println("greater than 50 but less than 60")
            5
        } else if (number > 40) {
            println("greater than 40 but less than 50")
            4
        } else if (number > 30) {
            println("greater than 30 but less than 40")
            3
        } else if (number > 20) {
            println("greater than 20 but less than 30")
            2
        } else {
            println("less than 20")
            0
        }
    println("criteria = $criteria")
}

fun prac() {
    val age = 29
    val boardingGroup = when (age) {
        in 0..18 -> "junior family"
        in 65..120 -> "senior living"
        else -> "regular"
    }
    println("You are in the $boardingGroup group.")

    val fromNothing = returnNothing()
    println("$fromNothing")

    var a = 100
    var b = 102
    //  a = b = 101 // this won't compile
}

fun string() {
    val greet: String = "firstString"
    val greeting: String = "Hello There"
    println("value of greet: $greet")
    println("value of greeting: $greeting")
    val owe = 100
    val mani = "I owe mani $owe D"
    val manikantaG = "I owe manikantaG \$$owe dollars"
    println("testing: $mani")
    println("testing: $manikantaG")

    val infinity = "The infinity symbol is \u221E"
    println(infinity)
    println(" [$greeting] is ${greeting.length} characters long")
    var bad = greeting.get(2)
    val letter = greeting[1]
    println("$bad")
    println("$letter")
    //TODO: To check on the compareTo implementations
    val compareFirst = "kia"
    val compareSecond = "kiaharomeo"
    println("${compareSecond.compareTo(compareFirst)}") //10
    println("${compareFirst.compareTo(compareSecond)}") //-10
    val test1 = "zbc"
    val test2 = "abcde"
    println("${test1.compareTo(test2)}")
    println("${test2.compareTo(test1)}")
    println("${"beta".compareTo("alpha")}")

    val sub = greeting.subSequence(6, 9)
    println("sub = $sub")

    for (i in greeting)
        print("$i ")

    // Raw strings in kotlin are wrapped with triple quotes
    val myString = """
        Kotlin is fun.
        Kotlin is pragmatic and null safe
    """
    println("$myString")
    // kotlin never changes the memory allocated to a main.kotlin.main.func.services.func.string instead it creates a new main.kotlin.main.func.services.func.string
}