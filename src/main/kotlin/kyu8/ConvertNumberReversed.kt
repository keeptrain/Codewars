package org.example.kyu8

fun digitize(n:Long):IntArray {
    // Code here
    return n.toString().map { it.toString().toInt() }.toIntArray()
}

fun main() {
    println(digitize(35231).toString())
}
