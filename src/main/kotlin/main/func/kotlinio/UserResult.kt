package main.func.kotlinio

//open class UserResult

// "sealed" --> means anyone who would like to inherit from "UserResult" has to be from this file,
// if we would like to use "UserResult" from outside then should leverage open"

sealed class UserResult
data class Success(val users: List<User>) : UserResult()
data class Failure(val message: String? = "") : UserResult()

fun retrieveUsers(): UserResult {
    return Success(usersFromJsonFile("users.json"))
}

fun main(args: Array<String>) {
    val result = retrieveUsers()

    when (result) {
        is Success -> result.users.forEach { println(it.username) }
        is Failure -> println(result.message)
    }

     val values = generateSequence(1) {it * 10}
    values.take(10).forEach { println(it) }

    val newUsers = usersFromJsonFile("users.json")
        .asSequence()

}