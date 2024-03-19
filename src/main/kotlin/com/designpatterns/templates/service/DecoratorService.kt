package com.designpatterns.templates.service

import com.designpatterns.templates.decorator.DecoratorLevel3
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class DecoratorService {

    fun getDecoratorImplementation(param: String): Mono<String> {
        return Mono.just(DecoratorLevel3().run(param))
    }
}