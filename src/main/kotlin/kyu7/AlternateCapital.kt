package org.example.kyu7

fun capitalize(text: String): List<String> {
    val capitalizeEven = text.mapIndexed { index, char ->
        if (index % 2 == 0) {
            char.uppercase() // Capitalize even index characters
        } else {
            char // Keep odd index characters unchanged
        }
    }.joinToString("")

    val capitalizeOdd = text.mapIndexed { index, char ->
        if (index % 2 != 0) {
            char.uppercase() // Capitalize odd index characters
        } else {
            char // Keep even index characters unchanged
        }
    }.joinToString("")

    return listOf(capitalizeEven,capitalizeOdd)
}

fun main() {
    println(capitalize("abcdef"))
}