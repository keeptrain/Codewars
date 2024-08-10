package org.example.kyu7

fun printerError(s: String): String {
    // code here
    val len = s.length
    val error = 'n'..'z'
    var result = 0
    for (i in error) {
       result += s.count { it == i}
    }

    return "$result/$len"
}

fun main() {
    println(printerError("aaabbbbhaijjjm"))
}