package org.example.kyu7

fun filterList(l: List<Any>): List<Int> {
    return l.filterIsInstance<Int>()
}