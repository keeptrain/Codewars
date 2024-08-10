package org.example.kyu7

fun solve(s: String): String {
    val uppercaseCount = s.count { it.isUpperCase() }
    val lowercaseCount = s.count { it.isLowerCase() }

    return if (uppercaseCount > lowercaseCount) {
        s.uppercase()
    } else {
        s.lowercase()
    }
}

fun main() {
    println(solve("COde"))
}