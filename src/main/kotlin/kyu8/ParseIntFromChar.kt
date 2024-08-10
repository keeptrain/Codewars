package org.example.kyu8

fun getAge(yearsOld: String): Int {
    val takeInt = "\\d+".toRegex().find(yearsOld)
    return takeInt?.value?.toInt()!!
}

fun getAges(yearsOld: String) = yearsOld.take(1).toInt()

fun main() {
    println(getAge("1 years 2 old"))
}


