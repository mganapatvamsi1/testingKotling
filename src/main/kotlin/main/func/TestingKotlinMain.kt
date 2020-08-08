package main.kotlin.main.func

import org.springframework.boot.runApplication

@org.springframework.boot.autoconfigure.SpringBootApplication
class TestingKotlinMain {
    fun main(args: Array<String>) {
//        runApplication<TestingKotlinMain>()
        runApplication<TestingKotlinMain>(*args)
    }
}