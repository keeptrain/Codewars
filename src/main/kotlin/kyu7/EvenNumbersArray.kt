package org.example.kyu7

fun evenNumbers(array: List<Int>, number: Int): List<Int> {

    val even= array.filter { it % 2 == 0 }

    return even.takeLast(number)
}

fun main() {
    evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3)
}