package org.example.kyu7

import kotlin.math.ceil

fun wallpaper(l: Double, w: Double, h: Double): String {

    val rectArea = 2 * (l * h + w * h)

    val totalArea = rectArea * 1.15

    val standartWidht = 0.52
    val standartLength = 10.0
    val totalRolls = standartWidht * standartLength

    val total = ceil(totalArea / totalRolls).toInt()

    val numberOfWords = arrayOf(
        "zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty")
    return if ( total <= 20) {
        numberOfWords[total]
    } else {
        total.toString()
    }
}

fun main() {
    println(wallpaper(4.0, 3.5, 3.0))
}