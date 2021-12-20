package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Dendi"), Person("Prayogo"), Person("Hidayat"), Person("Dendi")
    )

    println(set.size)
    println(set.contains(Person("Dendi")))

    for (person in set) {
        println(person)
    }
}