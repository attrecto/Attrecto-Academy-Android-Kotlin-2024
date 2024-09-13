package com.attrecto.academy.android.solution

/*
Legyél Te is Excel programozó!!
https://exceltitok.hu/excel-fuggveny/

Készítsd el a "SZUMHATÖBB" függvényt, és ennek segítségével számold ki egy listában lévő 3-nál nagyobb egész számok
összegét.
*/

// Nem excel programozóként azért ne használj magyar függvényneveket.
fun List<Int>.szumHaTobb(limit: Int): Int {
    var result = 0
    this.forEach {
        if (it > limit) {
            result += it
        }
    }

    return result
}

// Kicsit Kotlinosabb
fun List<Int>.szumHaTobb2(limit: Int) =
    this.filter { it > limit }.sum()

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(list.szumHaTobb(3))
    println(list.szumHaTobb2(3))
}