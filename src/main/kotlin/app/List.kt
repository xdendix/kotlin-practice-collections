package app

fun main() {
    val list: List<String> = listOf("Dendi", "Prayogo", "Hidayat")

    println(list[0]) // untuk mengambil data
    println(list[1]) // untuk mengambil data
    println(list[2]) // untuk mengambil data
    println(list.indexOf("Hidayat")) // untuk mengecek di posisi manakah data "Hidayat"
    println(list.indexOf("Tidak Ada")) // untuk mengecek data yang tidak ada
    println(list.contains("Dendi")) // untuk mengecek apakah data ini berada di list
    println(list.contains("Tidak Ada")) // untuk mengecek data yang tidak ada
    println(list.containsAll(listOf("Dendi", "Hidayat"))) // untuk mengecek data di list lebih dari satu data
    println(list.isEmpty()) // untuk mengecek apakah list kosong atau tidak
    println(list.isNotEmpty()) // untuk mengecek apakah list kosong atau tidak
}