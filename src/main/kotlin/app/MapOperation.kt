package app

fun main() {
    val map = mapOf("a" to "Dendi", "b" to "Prayogo", "c" to "Hidayat")

    // println(map.getValue("tidak ada")) // exception
    println(map.getValue("a"))
    println(map.getOrElse("tidak ada") { "Nothing" })
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}