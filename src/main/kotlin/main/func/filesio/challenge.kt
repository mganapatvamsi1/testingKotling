package main.func.filesio

import java.io.File

fun main() {
    val res = "./resources"

    val salesFile = File("$res/sales.txt")
    val sales = mutableListOf<Double>()

    salesFile.forEachLine {
        val dValue = it.toDoubleOrNull()
        if (dValue != null) {
            sales.add(dValue)
        }
    }
    sales.forEach{println(it)}



}