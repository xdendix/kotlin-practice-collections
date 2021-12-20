package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Dendi")
    mutableList.add("Prayogo")
    mutableList.add("Hidayat")

    // mutableList[2] = "Joko" // contoh untuk merubah data di dalam list
    // mutableList.remove("Prayogo") // contoh untuk merubah data di dalam list

    for (value in mutableList) {
        println(value)
    }
}