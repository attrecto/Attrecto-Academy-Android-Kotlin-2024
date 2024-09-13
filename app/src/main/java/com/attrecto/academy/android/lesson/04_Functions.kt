package com.attrecto.academy.android.lesson

// Sima paraméter nélküli függvény.
// Nem nagy meglepetés hogy ehhez sem kell class, mint a main()-hoz sem kellett.
// Van visszatérési értéke: Unit (olyan mint a void), csak nem kell kiírni.
fun hello() {
    println("Helló")
}

// Meg lehet nem Unit visszatérési értéke is
fun returnsAFour(): Int {
    return 4
}

// Lehet még egyszerűbb is
fun returnsAFourSimplified(): Int = 4

// Itt is működik a type inference, meg az egyszerűsítés
fun returnsAFourVerySimple() = 4

// A függvényeknek lehet paramétere is
fun hello(name: String) {
    println("Hello $name")
}

// akár több paramétere is
fun sum(x: Int, y: Int): Int {
    return x + y
}

// És itt is működik az egyszerűsítés
fun sum2(x: Int, y: Int) = x + y

// A függvényeknek lehet default paramétere, nem kell sok overload-olt fv.
fun sum3(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

// És a legjobb rész, osztályokat bővíthetünk ki saját függvényekkel. (Extension functions)
fun Int.timesTwo() = this * 2

// Készíts függvényt, ami szöveg paramétert vár, és a "kétszeresét" adja vissza. Pl "vau" -> "vauvau"
// Hasznos lehet: String.repeat()
//TODO

fun main() {
    hello()
    val four = returnsAFour()
    println("returnsAFour = $four")
    val four2 = returnsAFourVerySimple()
    println("returnsAFourVerySimple = $four2")

    hello("Balázs")

    // Named parameters, Lehet olyan is hogy csak 1-1 default-ot írok át.
    val result = sum3(1, 2, w = 4)

    println(4.timesTwo())
}