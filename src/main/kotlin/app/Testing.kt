package app

fun main() {
    val list = listOf("Dens", "Prayogo", "Hidayat")

    println(list.any { it.length > 5 }) // mengecek index adakah yang lebih dari 5 karakter
    println(list.none { it.length > 5 }) // mengecek index adakah yang tidak satupun data lebih dari 5 karakter
    println(list.all { it.length > 1 }) // mengecek index apakah semua data lebih dari 1 karakter
    println(list.any()) // mengecek apakah memiliki data
    println(list.none()) // mengecek apakah tidak memiliki data
}