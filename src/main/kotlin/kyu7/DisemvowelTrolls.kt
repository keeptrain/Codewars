package org.example.kyu7

fun disemvowel(str: String): String {
    val vowel = charArrayOf('a','i','u','e','o')
    var result = str

    for (i in vowel) {
        result = result.replace(i.toString(), "",ignoreCase = true)
    }

    return result
}

fun main() {
    println(disemvowel("This website is for losers LOL!"))
}