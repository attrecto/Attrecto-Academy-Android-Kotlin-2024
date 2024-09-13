package com.attrecto.academy.android.solution

/*
Készíts alkalmazást ami kiírja az első 10 Fibonacci számot.

Pl: 1, 1, 2, 3, 5, 8, 13, 21...

Ötlet a megoldáshoz: repeat()
https://hu.wikipedia.org/wiki/Fibonacci-sz%C3%A1mok

A fenti linken van egy megoldás ciklussal. A függvényes rekurzív megoldás talán elegánsabb, de még nem
vettünk függvényeket!
 */

fun main() {
    var a = 0
    var b = 1
    repeat(10) {
        b += a
        a = b - a
        println(a)
    }
}