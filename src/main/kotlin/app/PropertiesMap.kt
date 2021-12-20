package app

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    val map = mapOf(
        "name" to "Kotlin Practice",
        "version" to 1.0
    )

    val application = Application(map)

    println(application.name)
    println(application.version)
}