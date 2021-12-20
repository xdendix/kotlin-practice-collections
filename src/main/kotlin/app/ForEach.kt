package app

fun main() {
    setOf("Dendi", "Prayogo", "Hidayat").forEach {
        println(it)
    }

    mutableSetOf("Hidayat", "Prayogo", "Dendi").forEachIndexed { index, value ->
        println("$index : $value")
    }
}