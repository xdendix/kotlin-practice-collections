package app

import java.lang.StringBuilder

fun main() {
    val list: List<String> = listOf("Dendi", "Prayogo", "Hidayat")

    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    val string2: String = list.joinToString(" ", "|", "|") { it.uppercase() }
    println(string2)

    val string3: String = list.joinToString(" ", "|", "|") { it.lowercase() }
    println(string3)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", "<", ">")
    list.joinTo(builder, " ", "@", "@")
    val string4 = builder.toString()
    println(string4)

    val numbers: List<Int> = (1..100).toList()
    println(numbers.joinToString())
}