package com.attrecto.academy.android.lesson

fun main() {
    // Változó készítés, nincs kezdeti értéke, de van típusa. A kotlin típusos nyelv.
    var streetNumber: Int

    // Amíg nem adunk neki értéket, addig nem tudjuk használni
    // Próbáld meg kiiratni a streetNumber változó értékét, miért nem sikerül?
    // TODO

    // Változó készítés kezdő értékkel
    // Type inference: kitalálja mi lehet a típusa. Még egyszerűbben írhatjuk: var streetName = "Wesselényi"
    var streetName: String = "Wesselényi"

    // Próbáld ki, lehet egyszerűbben a típus megadása nélkül: streetName2 = "Wesselényi"
    // TODO

    // Mivel nem kell típust megadni, úgy tűnhet, hogy dinamikus típusa van egy változónak, de nem.
    // Ami egyszer int, az nem lehet más. Próbáld értékül adni a streetNumber változónak az "alma" string-et.
    // TODO

    // Amit kifejezetten szeretünk, a nem változtatható változó. Mindig ugyanez, sok gond nem lehet vele.
    // Java-ban nem volt ilyen. Idővel hozzászokik az ember és nagyon örül amikor valami nem változik.
    // Az IDE is szól ha
    val zip = "9024"

    // Próbálj meg új értéket adni a zip változónak, zip = "9025"
    // TODO

    // Próbálj meg új értéket adni a streetName változónak
    // TODO

    // Nagyon sok típus van: Int, Long, String. Mindegyik objektum (nincs primitív típus - java int és Integer)
    // Ennek most akkor mi a típusa?
    val myLong = 10
    val myReallyLong = 10L

    // Szintén kölönbség a java-tól, hogy nincs automatikus típus átalakítás, de vannak átalakító függvények
    val myLongAgain: Long = myLong.toLong()

    // Karakter és string
    val myChar = 'C'
    val myString = "C"

    // String interpolation (behelyettesítés)
    val years = 10
    val javaMessage = "A decade is " + years + " years"
    val message = "A decade is $years years"

    // Sőt lehet bonyolultabb kifejezéseket, vagy akár függvény hívást is kiértékeltetni
    val name = "Balázs"
    val nameMessage = "Length of $name is ${name.length}"
}