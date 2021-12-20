package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Dendi"))
    mutableSet.add(Person("Prayogo"))
    mutableSet.add(Person("Hidayat"))
    mutableSet.add(Person("Dendi"))
    mutableSet.add(Person("Prayogo"))

    for (person in mutableSet) {
        println(person)
    }

   // val mutableSetString = mutableSetOf("Dendi", "Prayogo", "Hidayat")
}