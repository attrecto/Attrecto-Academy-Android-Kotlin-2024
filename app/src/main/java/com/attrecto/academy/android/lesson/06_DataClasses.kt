package com.attrecto.academy.android.lesson

// Sokszor van, amikor ez osztályt igazából adatok tárolására használunk csak.
// Nem tartozik hozzá semmi logika.

// Ilyenkor érdemes data class-ot használni, mindjárt kiderül hogy miért
data class DataClassUser(val id: Int)

// Ez meg egy hagyományos class
class RegularClassUser(val id: Int)

fun main() {
    // A hagyományos osztályokat pointer alapján hasonlítja, ugyanúgy mint a java.
    val rcu1 = RegularClassUser(1)
    val rcu2 = RegularClassUser(1)
    // Azaz ez a két példány nem lesz egyforma, hiába ugyanazokat tartalmazzák.
    println(rcu1 == rcu2)

    // Ha viszont két data class-t hasonlítunk, akkor őket egyformának tekinti.
    val u1 = DataClassUser(1)
    val u2 = DataClassUser(1)
    println(u1 == u2)

    // Kapunk még egy jól olvasható toString() metódust is.
    println(u1)
    println(rcu1)

    // Illetve egy copy konstruktort, amivel meglévő példányból újat lehet létrehozni.
    val u3 = u1.copy(id = 3)
    println(u3)
}