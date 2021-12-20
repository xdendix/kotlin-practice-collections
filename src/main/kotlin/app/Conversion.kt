package app

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()

    println(array)
    println(range)
    println(list)
    println(set)
    println(mutableSet)
    println(mutableList)
    println(listToMutableList)
    println(setToMutableSet)
    println(sortedSet)
}