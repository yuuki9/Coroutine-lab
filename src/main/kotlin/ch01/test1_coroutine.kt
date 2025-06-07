package org.example.ch01

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//runBlocking 테스트 용으로 만 사용하길 권장
fun main() = runBlocking {
    println("main step 1")
    //launch는 코루틴을 실행하는 방식 중 하나로, 결과값을 반환하지 않고 단순히 비동기 작업을 실행
    val job = launch { //코루틴 구동
        var sum = 0
        for(i in 1 .. 10) {
            delay(100)
            sum += i
        }
    }
    println("main step 2")
    job.join()
    println("main end")
}


