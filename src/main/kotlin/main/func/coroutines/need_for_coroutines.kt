package main.func.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main(args: Array<String>) {
    val time  = measureTimeMillis {
        synchronous()
    }
    val asyncTime  = measureTimeMillis {
        asyncAwait()
    }
    println("synchronous time is $time ms")
    println("async time is $asyncTime ms")
}


suspend fun longCal(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

fun synchronous() = runBlocking {
    val x1 = longCal(100)
    val x2 = longCal(200)
    val x3 = longCal(300)
    val x4 = longCal(400)
    val sum = listOf(x1, x2, x3, x4).sum()
    println("results = $sum")
}

// async converts the values from integers to differed objects in this example
fun asyncAwait() = runBlocking {
    println("async/await beginning")
    val x1 = async { longCal(100) }
    val x2 = async { longCal(200) }
    val x3 = async { longCal(300) }
    val x4 = async { longCal(400) }
    val sum = listOf(x1, x2, x3, x4).awaitAll().sum()
    println("async/await results = $sum")
}
