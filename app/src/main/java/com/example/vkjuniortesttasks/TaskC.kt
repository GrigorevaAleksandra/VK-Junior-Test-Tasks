package com.example.vkjuniortesttasks

fun main() {
    val x = 20
    val items = mapOf("Milk" to 24.5, "Apple" to 13.4, "Pear" to 100, "Pack" to 0)
        .mapValues { it.value.toDouble() * 0.01 * (100 - x) }
        .toList()
        .sortedBy { pair -> pair.second }
        .reversed()
        .toMap()
        .forEach { productName, price ->
            val entry: String =
                if (price == 0.0) "Product: ${productName}, price: Бесплатно" else "Product: ${productName}, price: ${price}"
            println(entry)
        }
}