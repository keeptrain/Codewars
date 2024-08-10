package org.example.kyu8

class Kata {
    companion object {
        fun expressionsMatter(a: Int, b: Int, c: Int): Int {
            val one = a * (b + c)
            val two = a * b * c
            val three = a + b * c
            val four = (a + b) * c
            val five = a + b + c

            return maxOf(one, two, three, four, five)
        }
    }
}

fun main() {
    val clas = Kata.expressionsMatter(1,1,1)
    println(clas)
}