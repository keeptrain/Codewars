package org.example.kyu8

fun removeChar(str: String): String {
    // You got this!
    return str.replaceFirstChar { "" }.replaceAfterLast("", "")
}

fun optimize(str: String) : String = str.substring(1, str.length -1)

fun main() {
    //println(removeChar("ELOQUONT"))
    println(optimize("abcdefg"))
}