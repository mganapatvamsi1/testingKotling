package main.func.kotlinio

fun main() {
    val users = usersFromJsonFile("users.json")
//    findEmails(users, { value -> value.endsWith(".com") })
//    findEmails(users) { value -> value.endsWith(".com") }
    findEmails(users) { it.endsWith(".com") }

    val dotcomUsers = users.filter { it.email.endsWith(".com") }
        .sortedBy { it.id }
//        .map { Pair(it.email, it.username) }
        .map { it.email to it.username }

    val (testId,_,_) = users.filter { it.email.endsWith(".com") }
        .sortedBy { it.id }.first()
    // any variable that we don't want to use we can replace with an underscore
    println(testId)

}

fun findEmails(users: List<User>, predicate: (String) -> (Boolean)): List<User> {
    TODO("LATER.!")
}