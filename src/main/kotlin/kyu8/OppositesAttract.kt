package org.example.kyu8

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return (flowerA % 2 != 0 && flowerB % 2 == 0) || (flowerA % 2 == 0 && flowerB % 2 != 0)
}

fun optimize (flowerA: Int , flowerB: Int) = (flowerA + flowerB) % 2 == 1

fun main() {
    loveFun(1,4)
    loveFun(2,2)
}