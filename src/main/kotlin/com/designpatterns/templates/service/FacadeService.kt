package com.designpatterns.templates.service

import com.designpatterns.templates.facade.Facade
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class FacadeService {

    fun getFacadeImplementation(param: String): Mono<String> {
        return Mono.just(Facade().runAll(param))
    }
}