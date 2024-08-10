package org.example.kyu7

fun alphabetWar(fight: String): String {
    val leftSidePower = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val rightSidePower = mapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)

    var leftPower = 0
    var rightPower = 0

    for (char in fight) {
        if (char in leftSidePower) {
            leftPower += leftSidePower[char]!!
        }
        if (char in rightSidePower) {
            rightPower += rightSidePower[char]!!
        }
    }

    return when {
        leftPower > rightPower -> "Left side wins!"
        rightPower > leftPower -> "Right side wins!"
        else -> "Let's fight again!"
    }
}

fun main() {
    println(alphabetWar("zdqmwpbs"))
}