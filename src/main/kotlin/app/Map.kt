package app

fun main() {
    val map: Map<String, String> = mapOf(
        "a" to "Dendi",
        "b" to "Prayogo",
        "c" to "Hidayat"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}