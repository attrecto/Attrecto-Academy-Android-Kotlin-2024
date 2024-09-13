package com.attrecto.academy.android.lesson


// Ez egy class, sok mindent nem tudsz vele csinálni, de az!
class Alma

// De például példányosítani lehet
val alma = Alma()

class Customer1 {
    var id = 12

    // És ugyanúgy lehet immutable is
    var name: String = ""
}


// Kényelmesebb
class Customer2(initId: Int, initName: String) {
    // Ráadásul létrehozás után nem lehet változtatni az azonosítóját
    val id = initId
    var name: String = initName
}

// És igazából tovább egyszerűsíthető így a konstruktor paraméterből property lesz.
class Customer3(val id: Int, var name: String)

class Customer4(val id: Int, var name: String) {
    init {
        name = name.uppercase()
    }

    fun printName() {
        println(name)
    }
}

fun main() {
    val customer1 = Customer1()
    // a customer1 változó immutable, de az id property-je nem
    customer1.id = 13

    val customer2 = Customer2(12, "Béla")

    val customer3 = Customer3(12, "Béla")

    val customer4 = Customer4(12, "Béla")
    customer4.printName()

    customer4.name = "Béla"
    customer4.printName()
}
