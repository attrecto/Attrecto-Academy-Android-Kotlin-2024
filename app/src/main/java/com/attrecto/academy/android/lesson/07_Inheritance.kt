package com.attrecto.academy.android.lesson

// Minden osztály az Any-ből öröklődik
// Ha bele kattintasz az Any-be, láthatod hogy van néhány metódusa: equals(), hashCode(), toString()
class Apple : Any()

//  akkor is az Any az ősosztály ha nem írjuk ki.
class Banana

// Mint minden rendes OO programozási nyelv itt is van öröklődés.
// A java-val ellentétben itt "open"-re kell rakni az osztályt hogy öröklődni lehessen belőle.
// (A java-ban pont fordítva volt, ott a final mondta meg hogy nem lehet)
// Alepvetően zárkózott természetűek osztályok és metódusok
open class Person {
    // Hasonlóan az open kell akkor is ha felül szeretnénk írni egy metódust.
    // Próbáld ki mi történik ha nem "open"
    // TODO
    open fun validate() {
        println("Person.validate")
    }
}

class Student : Person() {
    override fun validate() {
        super.validate()
        println("Student.validate")
    }
}

fun main() {
    val s = Student()
    s.validate()
}