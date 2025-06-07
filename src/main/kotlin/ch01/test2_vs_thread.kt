package org.example.ch01

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val count = 10_000
    //만개의 Thread 생성
    var time = measureTimeMillis {
        val threadJobs = List<Thread>(count) {
            thread {
                Thread.sleep(1000)
                print(".")
            }
        }
        threadJobs.forEach{it.join()}
        //join()을 호출하면 그 작업이 끝날 때까지 현재 흐름을 블로킹(blocking)하거나 서스펜딩(suspending)
    }

    println()
    println("tread $count, total time : $time")

    time = measureTimeMillis {
        val coroutineJobs = List(count) {
            launch {
                delay(1000)
                print(".")
            }
        }
        coroutineJobs.forEach{it.join()}
    }

    println()
    println("tread $count, total time : $time")

}