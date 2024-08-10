package org.example.kyu7

fun accum(s:String):String {
    return s.mapIndexed { index, char ->
            char.uppercase() + char.lowercase().repeat(index)
        }.joinToString("-")
}

fun main() {
    println(accum("AbSde"))
}