package app

fun main() {
    val list: List<String> = listOf("Dendi", "Prayogo", "Hidayat")

    val (listMatch, listNotMatch) = list.partition { it.length > 5 } // mensortir apabila index lebih dari 5 akan masuk ke partisi pertama, dan index kurang dari 5 akan masuk ke partisi ke dua
    println(listMatch)
    println(listNotMatch)
}