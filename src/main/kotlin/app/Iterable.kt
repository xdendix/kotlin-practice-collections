package app

fun <T> displayIterable(iterable: Iterable<T>) {
    for (value in iterable) {
        println(value)
    }

    /**
     * cara manual
     */
    // val iterator = iterable.iterator()
    // while (iterator.hasNext()) {
    // val value = iterator.next()
    // println(value)
    //    }
}

fun main() {
    displayIterable(listOf("Dendi", "Prayogo"))
    displayIterable(setOf("Hidayat", "Prayoga"))
}