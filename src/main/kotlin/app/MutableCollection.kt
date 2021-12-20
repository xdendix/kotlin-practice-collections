package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Dendi", "Prayogo"))
    displayMutableCollection(mutableSetOf("Prayogo", "Hidayat"))
    displayMutableCollection(mutableMapOf("Hidayat" to "Hidayat").entries)
}