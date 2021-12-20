package app

fun main() {
    val pair1: Pair<String, String> = Pair("Dendi", "Prayogo")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Prayogo" to "Hidayat"
    println(pair2.first)
    println(pair2.second)
}