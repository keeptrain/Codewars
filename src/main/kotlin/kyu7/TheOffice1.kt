package org.example.kyu7

fun outed(meet: Map<String,Int>, boss: String): String {
    // Calculate total happiness including boss's double score
    val totalHappiness = meet.values.sum() + meet[boss]!!

    // Calculate average happiness considering boss as one person
    val averageHappiness = totalHappiness / (meet.size + 1)

    return if (averageHappiness <= 5 ) "Get Out Now!" else "Nice Work Champ!"
}


fun main() {
    println(outed(mapOf(
        "tim" to 0, "jim" to 2, "randy" to 0, "sandy" to 7, "andy" to 0, "katie" to 5,
        "laura" to 1, "saajid" to 2, "alex" to 3, "john" to 2, "mr" to 0) , "tim" ))
}