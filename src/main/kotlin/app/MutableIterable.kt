package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        // iterator.remove() // contoh untuk menghapus data di iterasi saat ini

        println(value)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Dendi", "Prayogo"))
    displayMutableIterable(mutableSetOf("Dendi", "Hidayat"))
    displayMutableIterable(mutableMapOf("Prayogo" to "Prayogo").entries)
}