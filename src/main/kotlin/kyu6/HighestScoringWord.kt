package org.example.kyu6

fun high(str: String) : String {

    val words = str.split (" ")

    var highestScore = 0
    var highestScoreWord = ""

    for (i in words) {
        val alphabet = i.sumOf { it - 'a' + 1 }
        if (alphabet > highestScore) {
            highestScore = alphabet
            highestScoreWord = i
        }
    }

    return highestScoreWord
}

fun main() {
    println(high("abad test example ssssssss"))
}