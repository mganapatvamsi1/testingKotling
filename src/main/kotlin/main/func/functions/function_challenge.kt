package main.func.functions

fun main() {
    replicate { count, message ->
        for (i in 1..count)
            println(message)
    }

}

// the Unit here says that the func.. function doesn't return anything
fun replicate(func: (Int, String) -> Unit) {
    func(1, "Always be happy.")
    func(2, "Being loved and having loved ones.")
    func(3, "Be thankful and cool.")

}