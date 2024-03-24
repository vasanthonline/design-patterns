package com.designpatterns.templates.service

import com.designpatterns.templates.chainofresponsibility.Level2
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ChainOfResponsibilityService {
    fun getChainOfResponsibilityImplementation(param: String): Mono<String> {
        return Mono.just(Level2(param).run())
    }
}