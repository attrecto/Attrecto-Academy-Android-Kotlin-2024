package com.attrecto.academy.android.lesson

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
Kotlin flows
*/
fun main() {
    runBlocking {
        val numberFlow = flowOf(1, 2, 3, 4)
        val nameFlow = flowOf("Alíz", "Béla", "Cili", "Dezső")

        numberFlow.collect {
            println(it)
        }

        // Akár újból begyűjti ha kell
        numberFlow.collect {
            println(it)
        }

        // Több flow-t kombinálhatunk össze
        combine(nameFlow, numberFlow) { name, number ->
            "$name, $number"
        }.collect {
            println(it)
        }

        // A stateFlow csak az utolsó állapotát őrzi meg
        val stateFlow = MutableStateFlow(5)
        stateFlow.update { 10 }
        val job = launch {
            stateFlow.collect {
                println(it)
            }
        }
        delay(1000)
        stateFlow.update { 15 }
        delay(1000)
        println("Most vége vége")
        job.cancel()
    }
}