package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Dendi", "Prayogo"))
    displayCollection(setOf("Prayogo", "Hidayat"))
    displayCollection(mapOf("Hidayat" to "Prayogo").entries)
    // displayCollection(mapOf("Hidayat" to "Prayogo")) // Error, Map bukan turunan Collection
}