package com.example.vkjuniortesttasks

fun main() {
    val names = arrayOf("Kostya", "Egor", "Albina", "Artur", "Dasha")
    val longestName = arrayOf("Kostya", "Egor", "Albina", "Artur", "Dasha").sortedBy { it.length }.last()
    print(longestName)
}