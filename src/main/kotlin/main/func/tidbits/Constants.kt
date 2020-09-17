package main.func.tidbits

const val copyrightAuthor = "William Shakespeare"

object Copyright {
    const val author = "Rabindranath Tagore"
}
// its good when we have a bunch of constants to wrap up and keep under an object like above
fun main(args: Array<String>) {
    println(copyrightAuthor)
    println(Copyright.author)
}