package com.attrecto.academy.android.solution

/*
Legyél Te is Excel programozó!!
https://exceltitok.hu/excel-fuggveny/

Készíts "Munkalap" osztályt, amit egy név (String) és egy data (String lista) paraméterrel lehet példányosítani.

Készítsd el a "Munkalap" osztály "DARABÜRES" függvényét, ami megszámolja a munkalap osztály data listájában
az üres elemeket.

Készítsd el a "Munkalap" osztály "DARAB2" függvényét,  ami megszámolja a munkalap osztály data listájában
az összes elemet
*/

class Munkalap(val name: String, private val data: List<String>) {
    fun darabUres() = data.count { it.isEmpty() }
    fun darab2() = data.count()
}

fun main() {
    val m = Munkalap("első", listOf("", "Alma", "", "Körte", "Barack"))
    println(m.darabUres())
    println(m.darab2())
}
