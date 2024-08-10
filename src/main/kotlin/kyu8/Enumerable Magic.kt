package org.example.kyu8

fun include(arr: IntArray, item : Int): Boolean {
    return arr.contains(item)
}

fun main() {
    println(include(intArrayOf(1,2,3,4),5))
}