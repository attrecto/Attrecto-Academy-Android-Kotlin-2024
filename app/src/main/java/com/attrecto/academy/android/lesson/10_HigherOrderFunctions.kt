package com.attrecto.academy.android.lesson

// A Kotlinban lehet olyan hogy függvényeket adunk paraméterül másik függvénynek, vagy függvény
// visszatérési értéke van egy függvénynek.

// Ez egy olyan függvény, aminek 2 int paramétere és egy függvény paramétere van
// ami szintén két int-et vár paraméterül, és egy int-el tér vissza
fun doIt(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

// Szóval készítsünk egy olyan fv-t, ami a fent praméterben átadott fv-nek.
fun add(x: Int, y: Int) = x + y

fun main() {
    // És meg lehet adni az első fv-nek.
    doIt(x = 2, y = 3, ::add)

    // Mi van akkor ha nincs ilyen függvényünk mint az add, és nem is akarunk külön fv-t készíteni
    // Lehet ezt helyben? Igen, lambda kifejezésekkel:
    doIt(x = 2, y = 3, op = { x: Int, y: Int -> x + y })

    // A fordító itt is kitalálja az elvárt típust, szóval nem kell megadni
    doIt(2, 3, op = { x, y -> x + y })

    // Ezt a fenti lambda fv-t akár változónek is értékül adhatom:
    // (De akkor kell a típus)
    val sumLambda = { x: Int, y: Int -> x + y }
    doIt(2, 3, sumLambda)

    // Nem olyan feltűnő, de a fordító aláhúzta kicsit hogy ha a függvénynek az utolsó paramétere
    // szintén egy függvény, akkor azt ki lehet szerverzni a függvény után.
    doIt(2, 3) { x, y -> x + y }

    // Ez néha elég bután néz ki, (mint az előző példa) de lehetőséget ad nagyon jól olvasható kód
    // írására:

    class Database {
        fun insert() {}
        fun begin() {}
        fun commit() {}
        fun rollback() {}
    }

    fun transaction(db: Database, code: () -> Unit) {
        try {
            db.begin()
            code.invoke()
            db.commit()
        } catch (e: Exception) {
            db.rollback()
        }
    }

    val db = Database()
    // Milyen szép! Mintha saját nyelvet írnánk!
    transaction(db) {
        db.insert()
    }
}