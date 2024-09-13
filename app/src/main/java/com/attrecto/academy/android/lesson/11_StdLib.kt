package com.attrecto.academy.android.lesson

/* Standard Library

Általában a nyelveknek van standard library-ja, a Kotlin-nak is. (pl a Javascript-nek nincs)
Gyakran használt utasítások
Kotlin esetében ez egy nagyon kis library
Sok higher order function (ami paraméterbe fv-t kap, vagy fv-t ad vissza)
Sok extension function

 */

fun main() {
    // Volt már róla szó, de ide tartoznak a listák
    // Ha van kezdeti érték, a String típust is kitalálja
    val list = listOf("alma", "barack", "dinnye", "eper")

    // Próbálj meg elemet hozzáadni a fenti listához
    // TODO

    // A lista immutable (nem változtatható), de van belőle változtatható változat is
    val mutableList = mutableListOf("alma", "barack")
    mutableList.add("citrom")

    // És sok műveletet is kapunk a listákhoz, lehet szűrni...
    val filter = list.filter { it.contains("a") }
    println(filter)

    // számolni...
    val count = list.count()
    println(count)

    // átalakítani...
    val map = list.map { it.length }
    println(map)
}