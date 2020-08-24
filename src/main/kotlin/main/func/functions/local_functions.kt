package main.func.functions

fun main() {
    val words = listOf("racecar", "civic", "butter", "legacy", "mam", "camry", "level", "text")
    for (word in words) {
        println("Palindrome $word? ${isPalindrome(word)}")
    }
}

fun isPalindrome(word: String): Boolean {
    fun doCharsMatch(front: Int, back:Int): Boolean {
        if (front >= back) return true
        if (word[front].toUpperCase() != word[back].toUpperCase()) return false
        return doCharsMatch(front + 1, back - 1)
    }
    if (word.length < 2) return true
    return doCharsMatch(0, word.lastIndex)
}