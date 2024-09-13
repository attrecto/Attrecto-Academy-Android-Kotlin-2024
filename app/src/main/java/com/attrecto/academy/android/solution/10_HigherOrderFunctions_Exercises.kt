package com.attrecto.academy.android.solution

/*
Legyél Te is Excel programozó!!
https://exceltitok.hu/excel-fuggveny/

Készítsd el a "SZUMHA" függvényt, és ennek segítségével számold ki egy listában lévő a tetszőleges feltétel paraméternek
megfelelő számok összegét
*/

// Nem excel programozóként azért ne használj magyar függvényneveket.
fun List<Int>.szumHa(condition: (Int) -> Boolean): Int {
    var result = 0
    this.forEach {
        if (condition(it)) {
            result += it
        }
    }

    return result
}

// Kicsit Kotlinosabb
fun List<Int>.szumHa2(condition: (Int) -> Boolean) = this.filter(condition).sum()
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(list.szumHa { it > 3 })
    println(list.szumHa2 { it > 3 })
}