package org.example.kyu7

fun getMiddle(word : String) : String {

    var result = ""

    result = if (word.length % 2 == 0) {
        word[word.length/2-1].plus(word[word.length/2].toString())
    } else {
        word[word.length/2].toString()
    }

    return result
}


fun main() {
    println(getMiddle("testin"))
}