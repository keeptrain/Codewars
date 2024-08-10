package org.example.kyu8

fun repeatStr(r: Int, str: String) : String = "${str.repeat(r)} "

fun main() {
    println(repeatStr(2,"Hi"))
}