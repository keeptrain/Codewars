package org.example.kyu8

fun points(games: List<String>): Int {
    var result = 0
    games.map { entry ->
        val parts = entry.split(":")
        if (parts.size == 2) {
            val firstValue = parts[0].toInt()
            val secondValue = parts[1].toInt()
            if (firstValue > secondValue) {
                result += 3
            } else if (firstValue == secondValue){
                result += 1
            } else {
                result += 0
            }
        }
    }
    return result
}

fun stringToNumber(str: String): Int {
    return str.toInt()
}

fun main() {
    println(points(listOf("1:1", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
}