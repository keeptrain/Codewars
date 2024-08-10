package org.example.kyu8

fun litres(time: Double): Int {
    return (time*0.5).toInt()
}

fun main() {
    println(litres(6.7))
}