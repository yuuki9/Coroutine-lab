package org.example.ch02

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    listOf("one","two","three").forEachIndexed { index, value ->
        launch(Dispatchers.Default) {
            println("coroutine.. $value start : ${Thread.currentThread().name}")
//            Thread.sleep(100L + index*100L)
            delay(100L + index*100L)
            println("coroutine.. $value end : ${Thread.currentThread().name}")
        }
    }
    Thread.sleep(2000)
}

//쓰레드가 교차가 될수 있다 중단함수를 사용하면