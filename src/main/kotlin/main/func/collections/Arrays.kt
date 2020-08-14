package main.func.collections

data class Student(val firstName: String, val grade: Int)

fun main() {
    val things = arrayOf(111, 1, 2, 3, 4, "one", "two", "three", "four")
    things[0] = "zero"
    for(thing in things) println(thing)

    val students = arrayOf(Student("Raj", 6), Student("Mani", 9), Student("Doozle", 2))
    students[1] = Student("Aryan", 10)
    for(student in students) println(student)

    val blue = Array(6, ::blues)
    blue.forEach { println(it)}
    println("blue has ${blue.size} elements")
    println("indices = ${blue.indices}")
    println("lastIndex = ${blue.lastIndex}")

    val printInts = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println("values = ${printInts.size}")

}

fun blues(index: Int): Int {
    return index * 6;
}