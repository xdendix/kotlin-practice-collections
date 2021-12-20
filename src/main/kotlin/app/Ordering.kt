package app

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 8, 9, 7, 6, 10, 0)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}