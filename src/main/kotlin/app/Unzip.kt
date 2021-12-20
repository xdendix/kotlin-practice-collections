package app

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Dendi" to "Senior",
        "Prayogo" to "Android",
        "Hidayat" to "Developer"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    // Destructuring
    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}