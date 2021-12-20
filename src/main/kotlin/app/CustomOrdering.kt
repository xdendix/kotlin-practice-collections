package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5),
        Fruit("Banana", 7)
    )

    println(fruits.sortedBy { it.name }) // sorted dengan nama
    println(fruits.sortedBy { it.quantity }) // sorted dengan quantity

    println(fruits.sortedByDescending { it.name }) // sorted dengan nama menurun
    println(fruits.sortedByDescending { it.quantity }) // sorted dengan quantity menurun

    // contoh dengan manual compare
    println(
        fruits.sortedWith { fruit1, fruit2 ->
            fruit1.quantity.compareTo(fruit2.quantity)
        }
    )
}