package com.attrecto.academy.android.lesson

data class Book(val id: Int, val title: String)

// Szintén vannak interface-ek is
interface BookDataSource {
    // Ahol megadhatunk metódust
    fun select(): List<Book>

    // És nagy meglepetésre adhatunk meg default implementációt is!! Ez máshol nem szokás,
    // pont erre vannak az absztrakt osztályok (amik kikerültek a tananyagból)!
    fun getById(id: Int): Book = select().first { it.id == id }
    fun first(): Book = select().first()

    fun store(book: Book)
}

// Ez pedig egy megvalósítása az interface-nek
class SQLBookDataSource : BookDataSource {
    // Amiben kötelező kifejteni a default implementációval nem rendelkező metódusokat
    override fun store(book: Book) {
        print("store")
    }

    override fun select(): List<Book> {
        return listOf(Book(0, "A"), Book(1, "B"))
    }

    // És akár felül lehet írni a default implementációval rendelkezőket is. De nem kötelező.
    override fun getById(id: Int): Book {
        return Book(id, "")
    }
}

fun main() {
    val dataSource: BookDataSource = SQLBookDataSource()
    println(dataSource.select())
    println(dataSource.first())
    println(dataSource.getById(5))
}