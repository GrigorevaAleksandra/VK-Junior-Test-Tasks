package com.example.vkjuniortesttasks

fun main() {
    val array = arrayOf(1, -34, 229, -4, 55, 69, 102, 37, 98, 0, -1)

    var biggestGrade = 0
    array.forEach { number ->
        if (biggestGrade < number && number in 0..100) biggestGrade = number
    }
    print(biggestGrade)
}