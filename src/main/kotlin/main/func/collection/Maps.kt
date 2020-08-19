package main.func.collection

fun main() {
    val map1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val map2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")
    println("map1 == map2? ${map1 == map2}")
    println("map1[2] = ${map1[2]}")
    println("map1[5] = ${map1[5]}")
    println("map1[5] safe = ${map1.getOrDefault(5, "NotPresent")}")
    println()

    val cars = mutableMapOf("ford" to 1903, "gm" to 1908, "dodge" to 1913, "tucker" to 1944)
    println("cars = $cars")
    cars["tesla"] = 2003
    cars["hyundai"] = 2000
    cars["toyota"] = 1937
    cars["honda"] = 1948
    println("updated cars = $cars")
    println("removed tucker = ${cars.remove("tucker")}")
    println("cars final list = $cars")
    println()

    for (key in cars.keys) {
        println(key)
    }
    println("has ford? ${"ford" in cars}")
    println("has 2000? ${2000 in cars.values}")


}