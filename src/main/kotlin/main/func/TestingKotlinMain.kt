package main.kotlin.main.func

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestingKotlinMain {
    fun main(args: Array<String>) {
//        runApplication<TestingKotlinMain>()
        runApplication<TestingKotlinMain>(*args)
    }
}