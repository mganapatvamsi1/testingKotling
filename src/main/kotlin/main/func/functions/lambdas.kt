package main.func.functions

fun main() {
//    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val lambda: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum = ${lambda(10,20)}")

    val lambda2 = { a: Int, b: Int -> a * b }
    println("Mul  = ${lambda2(5,5)}")
    println("invoking mul  = ${lambda2.invoke(10,5)}")
    println()

    val number = listOf(1, 5, 7, 9, 11, 12, 13)
    println( number.filter { it % 3 == 0 }.filter { it > 9 } )
    val greeting: String.() -> String = {"What's up $this?"}
    println("ManiG".greeting())
}