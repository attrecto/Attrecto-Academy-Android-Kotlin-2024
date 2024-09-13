package com.attrecto.academy.android.solution

/*
Egy lépcsőn szeretnél felmenni, egyet vagy kettőt léphetsz egyszerre. Hányféleképp juthatsz fel az n. lépcsőre?

Pl.:
1 lépcső : 1 = 1
2 lépcső : 2, 1+1 = 2
3 lépcső : 1+2, 2+1, 1+1+1 = 3
4 lépcső : 2+2, 1+1+2, 1+2+1, 2+1+1, 1+1+1+1 = 5

Ötlet a megoldáshoz: rekurzív függvény,
Ha elakadtál : https://www.geeksforgeeks.org/count-ways-reach-nth-stair/
 */

fun steps(n: Int): Int = when {
    n < 0 -> throw Exception()
    n == 0 -> 1  // Kicsit talán fura, de 0 lépcsőre egyféleképp léphetünk fel: ha nem lépünk
    n == 1 -> 1
    else -> steps(n - 1) + steps(n - 2)
}

fun steps2(n: Int): Int = when {
    n < 0 -> throw Exception()
    n == 1 -> 1
    n == 2 -> 2
    else -> steps2(n - 1) + steps2(n - 2)
}

fun main() {
    println(steps(4))
    println(steps2(4))
}