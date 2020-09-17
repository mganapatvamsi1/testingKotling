package main.func.functional

/* Higher order functions: means functions that take in other functions as parameters. */
fun operation(x: Int, y: Int, ope: (Int, Int) -> Int): Int {
    return ope(x, y)
}

fun operation(x: Int, ope: (Int) -> Int) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun summation(a: Int, b: Int) = a + b

fun unaryOperation(x: Int, ope: (Int) -> Int) {}

fun unaryOp(op: (Int) -> Int) {}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}


fun main(args: Array<String>) {
    println(operation(3, 7, ::summation))
    println(operation(3, 7) { x, y -> x + y })

    unaryOperation(3) { x -> x * x }

    unaryOperation(3) { it * it }

    unaryOp {
        it / it
    }
    val db = Database()
    transaction(db) {
        // interact with database
    }

    unaryOperation(3, fun(x: Int): Int { return x * x})


}