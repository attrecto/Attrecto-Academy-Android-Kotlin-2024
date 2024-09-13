package com.attrecto.academy.android.solution

/*
Készíts egy twice függvényt, az első paramétere egy függvény, aminek a paramétere egy szám, és az eredménye is egy szám.

A twice függvény végrehajtsa végre kétszer a paraméterben megadott függvényt a szintén paraméterben megadott számon.

 */

fun twice(function: (Int) -> Int, number: Int) = function(function(number))

fun main() {
    println(twice({ 2 * it }, 5))
}