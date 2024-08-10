package org.example.kyu7

fun fireFight(s: String) = s.replace("Fire" , "~")

fun main() {
    println(fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"))
}