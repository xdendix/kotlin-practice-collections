package app

fun main() {
    val list1 = listOf("Dendi", "Prayogo", "Hidayat")
    val list2 = list1 + "Android Developer"
    println(list2)

    val list3 = list1 + listOf("Mobile", "Android", "Developer")
    println(list3)

    val list4 = list1 - "Hidayat"
    println(list4)

    val list5 = list1 - listOf("Dendi", "Prayogo", "Hidayat")
    println(list5)

    // contoh Plus Minus di Map
    val map1 = mapOf("a" to "Dendi", "b" to "Prayogo")
    val map2 = map1 + ("c" to "Hidayat")
    println(map2)

    val map3 = map1 - "a"
    println(map3)
}