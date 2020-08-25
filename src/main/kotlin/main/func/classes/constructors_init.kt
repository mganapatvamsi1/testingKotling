package main.func.classes

class Vehicle(
    val make: String, val model: String,
    val year: Int, val area: String = "Napleton -", val state: String = "MO"
) {

    override fun toString(): String {
        return "$year $make $model ($area $state)"
    }

    init {
        println("First initializer block - $this")
    }

    //secondary constructor
    constructor(
        make: String, model: String,
        year: Int, area: String, state: String, style: String
    ): this(make, model, year, area, state) {
        this.style = style
    }

    constructor(
        make: String, model: String,
        year: Int, area: String, state: String, style: String, status: String
    ): this(make, model, year, area, state, style) {
        this.status = status
    }
    private var status = ""
    private var style = ""

}


fun main() {
    val car = Vehicle("Hyundai", "Sonata", 2018)
    println("car = $car")
    val car2 = Vehicle(state = "IL", year = 2019, make = "Toyota", model = "Camry", area = "Bommarito -")
    println("second car = $car2")
    val car3 = Vehicle(state = "CT", year = 2017, make = "Honda", model = "Accord", area = "New Haven -", style = "A300")
    println("car3 = $car3")
    val car4 = Vehicle(state = "NY", year = 2020, make = "Mercedes", model = "E350", area = "Long Island -", style = "350", status = "new")
    println("car4 = $car4")

}
