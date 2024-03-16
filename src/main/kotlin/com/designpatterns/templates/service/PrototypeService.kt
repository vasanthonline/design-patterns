package com.designpatterns.templates.service

import com.designpatterns.templates.prototype.Prototype1
import com.designpatterns.templates.prototype.Prototype2
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PrototypeService {
    fun getPrototypeImplementation(variant: String): Mono<String> {
        return when(variant) {
            "proto1" -> Mono.just(Prototype1(1,2).clone().toString())
            "proto2" -> Mono.just(Prototype2(1,3).clone().toString())
            else -> TODO("Not Implemented")
        }
    }
}