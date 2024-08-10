package org.example.kyu8

public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {

        return mixed.sumOf { it.toString().toInt() }
    }
}

fun main() {
    val clas = MixedSum().sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7))
    println(clas)
}