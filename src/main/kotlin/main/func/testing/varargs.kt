package main.func.testing


fun printStrings(vararg strings: String) {
    reallyStrings(*strings)
}

//private fun reallyStrings(strings: Array<out String>) {
private fun reallyStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    printStrings("a", "b", "c", "d")
    println()
    println()
    printStrings("a", "b", "c", "d", "e", "f", "g", "h")
    println()
    println()
    printStrings("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n")
}