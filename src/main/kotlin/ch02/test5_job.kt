package org.example.ch02

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("main step 1..")
    val job = launch {
        println("coroutine step 1..")
        delay(300)
        println("coroutine step 2..")
    }
   job.cancel()
    println("main step 2..")
}