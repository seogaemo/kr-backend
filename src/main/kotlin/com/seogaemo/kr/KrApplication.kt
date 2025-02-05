package com.seogaemo.kr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class KrApplication

fun main(args: Array<String>) {
    runApplication<KrApplication>(*args)
}
