package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap["a"] = "Dendi"
    mutableMap["b"] = "Prayogo"
    mutableMap["c"] = "Hidayat"

    println(mutableMap["a"])
    println(mutableMap["b"])
    println(mutableMap["c"])
    println(mutableMap.getOrDefault("d", "Tidak Ada"))
    println(mutableMap["d"])

    mutableMap.remove("a") // contoh untuk menghapus data

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}