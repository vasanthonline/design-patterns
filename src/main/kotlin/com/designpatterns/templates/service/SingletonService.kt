package com.designpatterns.templates.service

import com.designpatterns.templates.singleton.Singleton
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class SingletonService {
    fun getSingletonImplementation(variant: String): Mono<String> {
        return Mono.just(Singleton.create(variant).toString())
    }
}