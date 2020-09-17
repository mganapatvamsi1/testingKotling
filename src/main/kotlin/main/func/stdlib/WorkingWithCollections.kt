package main.func.stdlib


fun main(args: Array<String>) {

    var list: List<String> = ArrayList()

    val empty = emptyList<String>()

    var readOnlyList = listOf("first", "second", "third", "fourth")
    //In the above immutable lists we can only read or get elements from a list but can't add or set anything


    var readWriteList = mutableListOf("a", "b", "c", "d")
    println(readWriteList)
    readWriteList.add("e")
    println(readWriteList)


    var map= mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    var newMap= hashMapOf(Pair("a", 1), Pair("b",  2), Pair("c", 3))


    var testMap= mapOf("a" to 1, "b" to 2, "c" to 3)






}