package com.example.vkjuniortesttasks

fun main() {
    val names = arrayOf("Kostya", "Egor", "Albina", "Artur", "Dasha")
    val longestName = names.sortedBy { it.length }.lastOrNull()
    print(longestName)
}