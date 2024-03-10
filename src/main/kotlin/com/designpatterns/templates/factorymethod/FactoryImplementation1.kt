package com.designpatterns.templates.factorymethod

import reactor.core.publisher.Mono

class FactoryImplementation1 : FactoryInterface {
    override fun run(variant: String): Mono<String> {
        return Mono.just("Factory Implementation 1 for $variant")
    }
}