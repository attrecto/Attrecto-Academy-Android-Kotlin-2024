package com.attrecto.academy.android.lesson


fun main() {

    data class Cella(val column: Char, val row: Int, val value: String)

    val data = listOf(
        Cella('A', 1, "Alma"),
        Cella('A', 2, "Barack"),
        Cella('A', 3, "Körte"),
        Cella('A', 4, "Dinnye"),

        Cella('B', 1, "Tercsi"),
        Cella('B', 2, "Fercsi"),
        Cella('B', 3, "Kata"),
        Cella('B', 4, "Klára"),
    )

    // Számold össze hány cella van
    // TODO


    // Gyűjtsd össze az 'A' oszlop celláit
    // TODO


    // Gyűjtsd össze a cellák összes értékét
    // TODO
}