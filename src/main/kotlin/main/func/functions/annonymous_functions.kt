package main.func.functions

/**
 * Anonymous Functions:
 * 1) If we need to return a value, we must use the return keyword.
 * 2) If an anonymous function lacks a return, if returns the default Unit type.
 * 3) If there's a disagreement between either the variable's type or the function's return type, then its a compilation error.
 * 4) Use this mostly when there are multiple return statements
 */
fun main() {
    val number = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val fNumber = number.filter( fun(a: Int): Boolean {return a < 8 && a % 2 == 0} )
    println(fNumber)

    val fNum = number.filter(fun(a) = a < 8 && a % 2 == 0)
    println(fNum)
    println()

    // when we need to have multiple returns in a lambda then annonymous functions beat lambda
    //using lambdas
    val getAgeLambda = lambda@{
        age: Int ->
        if(age >= 65)
            return@lambda "senior discount"
        else if(age >= 21)
            return@lambda "regular"
        "underage"
    }
    println("Client pays ${getAgeLambda(31)} price")

    //using annonymous functions
    val getAgeAnnonymous = fun(age: Int):String {
        if(age >= 65)
            return "senior discount"
        else if(age >= 21)
            return "regular"
        return "underage"
    }
    println("Client pays ${getAgeAnnonymous(71)} price")
}