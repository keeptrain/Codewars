package org.example.kyu7

fun partlist(arr:Array<String>):Array<Array<String>> {
    // List to hold the pairs of parts
    val result = mutableListOf<Array<String>>()

    // Loop through each possible split point
    for (i in 1 until arr.size) {
        val part1 = arr.sliceArray(0 until i)
        val part2 = arr.sliceArray(i until arr.size)
        result.add(arrayOf(part1.joinToString(" "), part2.joinToString(" ")))
    }

    return result.toTypedArray()
}

fun main() {
    val arr = arrayOf("cdIw", "tzIy", "xDu", "rThG")

    partlist(arr).forEach { pair ->
        println(pair.joinToString(" , "))
    }

}