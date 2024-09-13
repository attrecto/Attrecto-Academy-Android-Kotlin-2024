package com.attrecto.academy.android.solution

/*
Legyél Te is Excel programozó!!
https://exceltitok.hu/excel-fuggveny/

Készítsd el a "SZUM" függvény megfelelőjét, számold ki egy listában lévő egész számok összegét.
*/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    var result = 0
    numbers.forEach {
        result += it
    }

    println(result)

    // Aztán persze valaki már megelőzött, ne búsulj nemsokára készítünk ilyesmi (extension) függvényt is!
    println(numbers.sum())
}