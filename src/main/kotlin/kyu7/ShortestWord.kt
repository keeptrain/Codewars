package org.example.kyu7

import kotlin.math.min

fun findShort(s: String): Int {
    val index = s.split(" ")
    var result = Int.MAX_VALUE

    for (i in index){
        if (i.length < result) {
            result = i.length
        }
    }
    return result
}


fun main() {
    println(findShort("turns out ww random test cases are easier than writing out basic ones"))
}