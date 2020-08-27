package main.func.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.system.measureTimeMillis


fun main() {
    val timeoutTime = measureTimeMillis {
        timeout()
    }
    val cancelTimeout = measureTimeMillis {
        cancel()
    }
    println("time: $timeoutTime ms")
    println("cancelTimeout: $cancelTimeout ms")
}


suspend fun longCal1(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}


// async converts the values from integers to differed objects in this example
fun timeout() = runBlocking {
    println("async/await beginning")
    val results = withTimeoutOrNull(602L) {
        val x1 = async { longCal1(100) }
        val x2 = async { longCal1(200) }
        val x3 = async { longCal1(300) }
        val sum1 = listOf(x1, x2, x3).awaitAll().sum()
        println("async/await results = $sum1")
        "finished processing"
    } ?: "timed out.!"
    println("final results = $results")
}

fun cancel() = runBlocking {
    val job =  launch(Dispatchers.Default) {
        var i = 0
        var nextPrintTime = System.currentTimeMillis()
        while (isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("working for ${i * 100} ms ...")
                nextPrintTime += 100L
                i++
            }
        }
        println("cancelled job successfully.")
    }
    delay(1000L)
    println("cancelling...!")
    job.cancelAndJoin()
    println("done")

}
