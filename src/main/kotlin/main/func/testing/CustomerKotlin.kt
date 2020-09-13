package main.func.testing

data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        return "{\"id\" : \"$id\", \"name\" : \"$name\"}\n"
    }
}

fun main(args: Array<String>) {
    val customerKotlin = CustomerKotlin(10, "rajAryan", "abc@123.com")

    println(customerKotlin)
}