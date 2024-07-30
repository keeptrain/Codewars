package kyu7

fun twoOldestAges(ages: List<Int>):List<Int> {
    val sortedAges = ages.sorted()
    val a = sortedAges.max()
    var b = sortedAges.max()

    if (a == b) {
        b = sortedAges[sortedAges.size-2]
    }
    return listOf(a,b)
}

fun optimize(ages: List<Int>):List<Int> = ages.sorted().takeLast(2)

fun main() {
    println(twoOldestAges(arrayListOf(0,1,2,3,4,5,10,99)))
    println(optimize(listOf(100,20,30,40,10,55)))
}