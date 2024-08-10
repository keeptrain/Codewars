package org.example.kyu7

import kotlin.math.sqrt

fun predictAge (
    age1: Int, age2: Int, age3: Int, age4: Int,
    age5: Int, age6: Int, age7: Int, age8: Int): Int {
    val ages = arrayOf(age1, age2, age3, age4, age5, age6, age7, age8)
    var result = 0
    for (age in ages) {
        result += age * age
    }
    return sqrt(result.toDouble()).toInt() / 2
}

fun main() {
    println(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
}