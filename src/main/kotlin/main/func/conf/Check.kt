package main.func.conf

fun main(args: Array<String>) {
    area(10, 20, 30)
}

fun area(length: Int, width: Int, height: Int) {
    println("length is $length, width is $width and height is $height")
    for (i in 1..10) {
        println("i = $i")
    }

    val students = listOf<String>("Scott", "Sharma", "Rajpal", "Mahoney", "Scotfield")
    for (student in students) {
        println("Current student is $student")
    }

    for ((index, student) in students.withIndex()) {
        println("Student #${index + 1} is $student")
    }


    println("while")
    var count = 5
    while (count > 0) {
        println(count)
        count --
    }

    println("do-while")
    do {
        println(count)
        count ++
    } while (count < 5)

    println("break")
    while (count > 0) {
        if (count % 2 == 0) break
        println(count)
        count --
    }

}