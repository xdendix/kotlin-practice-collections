package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Dendi", "Prayogo", "Hidayat"),
        listOf("Dendi", "Prayogo", "Hidayat"),
        listOf("Dendi", "Prayogo", "Hidayat"),
        listOf("Dendi", "Prayogo", "Hidayat")
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Dendi", listOf("Coding", "Reading")),
        Member("Prayogo", listOf("Gaming", "Traveling"))
    )

    val hobies: List<String> = members.flatMap { it.hobies }
    println(hobies)
}