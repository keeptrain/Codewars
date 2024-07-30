package kyu8

fun abbrevName(name: String): String {
    return name[0].uppercaseChar()+ "." + name[name.indexOf(" ") + 1].uppercaseChar()
}

fun optimize(name: String): String = name.split(" ").joinToString ( "." ){it.take(1).uppercase()}

fun greet ():String {
    return "hello world!"
}

fun main() {
    //println(abbrevName("sam sauce"))
    println(optimize("sam sauce"))
}