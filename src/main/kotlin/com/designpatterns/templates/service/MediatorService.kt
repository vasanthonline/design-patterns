package com.designpatterns.templates.service

import com.designpatterns.templates.mediator.MediatorImplementation
import com.designpatterns.templates.mediator.ReceiverComponent
import com.designpatterns.templates.mediator.SenderComponent
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class MediatorService {

    fun getMediatorImplementation(param: String): Flux<String> {
        val mediator = MediatorImplementation()

        return Flux.merge(Mono.just(SenderComponent(mediator).send(param)), Mono.just(ReceiverComponent(mediator).receive()))
    }
}