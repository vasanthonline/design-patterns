package com.designpatterns.templates.service

import com.designpatterns.templates.memento.MementoImplementation
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MementoService {

    fun getMementoImplementation(param: String): Mono<String> {
        val memento = MementoImplementation().save(param)
        return Mono.just(memento.restore())
    }
}