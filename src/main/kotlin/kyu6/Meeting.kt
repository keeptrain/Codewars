package org.example.kyu6

fun meeting(s: String): String {

    // Membagi string berdasarkan delimiter ';'
    val pairs = s.split(";")

    // Memproses setiap pasangan
    val result = pairs.map { pair ->
        // Membagi pasangan berdasarkan delimiter ':'
        val (firstName, lastName) = pair.split(":")
        // Mengubah nama depan dan nama belakang menjadi huruf kapital
        val formattedFirstName = firstName.uppercase()
        val formattedLastName = lastName.uppercase()
        // Membentuk string dalam format yang diinginkan
        "($formattedFirstName, $formattedLastName)"
    }

    // Menggabungkan hasil dengan tanda kurung tanpa spasi
    return result.sorted().joinToString("")
}

fun main() {
    println(meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"))
}