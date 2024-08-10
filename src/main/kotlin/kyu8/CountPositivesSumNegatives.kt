package org.example.kyu8

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    if (input!!.isEmpty()) {
        return arrayOf()
    }

    val positif = input.filter { it > 0 }.count()
    val negatif = input.filter { it < 0 }.sum()

    return arrayOf(positif,negatif)
}

fun main() {
    val numbers = arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)

    // Menghitung jumlah angka positif dan jumlah total angka negatif
    val (countPositives, sumNegatives) = countPositivesSumNegatives(numbers)

    // Menggabungkan hasil dalam format string
    val result = "Count of positives: $countPositives, Sum of negatives: $sumNegatives"

    // Menampilkan hasil
    println(result)
}