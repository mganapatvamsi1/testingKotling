package main.func

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TestingKotlinMain {
    fun main(args: Array<String>) {
//        runApplication<TestingKotlinMain>()
        runApplication<TestingKotlinMain>(*args)
    }
}