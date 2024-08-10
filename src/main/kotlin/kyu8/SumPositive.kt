package org.example.kyu8

fun sum(numbers: IntArray): Int {
    // Place your code here
    return numbers.filter { it > 0}.sum()
}

fun main() {
    sum(intArrayOf(1,2,3,4,-5))
}