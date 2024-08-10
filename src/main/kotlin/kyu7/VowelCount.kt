package org.example.kyu7

import kyu7.twoOldestAges

fun getCount(str : String) : Int {
    val vowel = charArrayOf('a', 'i', 'u', 'e', 'o')
    var result = 0

    for (i in vowel) {
        result += str.count { it == i }
    }
    return result
}


fun main() {
    println(getCount("abracadabra"))
}