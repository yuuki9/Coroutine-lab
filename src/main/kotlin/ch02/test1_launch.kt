package org.example.ch02

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("main step 1")
    //coroutine builder ... 만들자 마자 코루틴 실행
    launch {
        println("coroutine start..")
        delay(300)
        println("coroutine end..")
    }
    //코루틴이 동작시에 메인 쓰레드 대기 코루틴이 끝날때까지 잠시대기
    println("main step 2..")
    delay(1000)
    println("main end ..")
}