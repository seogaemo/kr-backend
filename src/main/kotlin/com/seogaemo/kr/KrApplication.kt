package com.seogaemo.kr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KrApplication

fun main(args: Array<String>) {
    runApplication<KrApplication>(*args)
}
