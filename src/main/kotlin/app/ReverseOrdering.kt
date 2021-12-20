package app

fun main() {
    val list = mutableListOf("Dendi", "Prayogo", "Hidayat")

    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()

    println(listReversed)
    println(listAsReversed)

    list.add("Programmer")

    println(listReversed)
    println(listAsReversed)
}