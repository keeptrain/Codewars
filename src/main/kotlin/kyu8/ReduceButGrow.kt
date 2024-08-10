package org.example.kyu8

fun grow(arr: IntArray): Int {
    return arr.fold(1) {arr, i -> arr * i*2  }
}

fun main() {
    println(grow(intArrayOf(1,2,3,4)))
}