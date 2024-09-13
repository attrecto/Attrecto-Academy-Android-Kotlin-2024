package com.attrecto.academy.android.lesson

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
Kotlin coroutines
 */
fun load(string: String, callback: (String) -> Unit) {
    println("load($string, callback)")
    Thread.sleep(1000)
    // Itt valami hosszan tartó netes hívás hajtódik végre, és a callback-ban hív vissza az eredménnyel.
    callback(listOf("Alma", "Barack", "Citrom", "Dinnye").random())
}

suspend fun load(string: String): String {
    println("load($string)")
    delay(1000)
    return listOf("Alma", "Barack", "Citrom", "Dinnye").random()
}

fun main() {
    // Többször elő fog fordulni: ne futtass hosszan tartó műveleteket a main thread-en.

    // Hagyományos megoldás, a callback, és a callback hell
    load("getUser", callback = { user ->
        load("getMother($user)", callback = { mother ->
            load("getFather($user)", callback = { father ->
                println("$user = $mother x $father")
            })
        })
    })

    // Suspend function-okat csak CoroutineScope-ból, vagy másik suspend function-ból indíthatsz
    runBlocking {
        val user = load("getUser")
        val mother = load("getMother($user)")
        val father = load("getFather($user)")
        println("$user = $mother x $father")
        // Remek, de hol volt itt a párhozamosítás?! Sehol :-D

        launch {
            val user = load("getUser")
            val mother = load("getMother($user)")
            val father = load("getFather($user)")
            println("$user = $mother x $father")
        }

        // Hogy megvárjuk a végét
        delay(4000)
        println("Itt a vége")
    }
}