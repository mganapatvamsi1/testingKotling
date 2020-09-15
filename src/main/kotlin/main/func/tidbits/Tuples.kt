package main.func.tidbits

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("XYZ", 100000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("india", "asia", 200000)
}

fun main(args: Array<String>) {

    val result = capitalAndPopulation("testing")
    println(result)
    println(result.component1())
    println(result.component2())
    println(result.first)
    println(result.second)
    println()
    val countryInfo = countryInformation("india")
    println(countryInfo)
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)
    println()
    println()
    val (a, b) = capitalAndPopulation("XYZ")
    println(a)
    println(b)
    println()
    println()
    val (e, f,g) = countryInformation("india")
    println(e)
    println(f)
    println(g)
    println()
    println()

    val listOfCapitalsAndCountries = listOf(Pair("newDelhi", "India"),"Kathmandu" to "Nepal", "WashingtonDC" to "UnitedStates")
    for ((capital, country) in listOfCapitalsAndCountries) {
        println("$capital - $country")
    }

}