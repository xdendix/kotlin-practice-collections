package app

fun main() {
    val list1 = listOf("Dendi", "Prayogo", "Hidayat")
    val list2 = list1.filter { it.length > 5 } // memfilter index yg lebih dari 5
    println(list2)

    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 } // menampilkan data Genap saja
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "Dendi", "Prayogo", 2, null)
    val listString = list4.filterIsInstance<String>() // menampilkan index String saja
    println(listString)

    val listInt = list4.filterNotNull() // menampilkan index yang bukan null
    println(listInt)
}