package com.designpatterns.templates.abstractfactory.implementations

import reactor.core.publisher.Mono

class FactoryItem2Variant1: FactoryItem2 {
    override fun run(): Mono<String> {
        return Mono.just("Factory Item 2 for variant 1")
    }
}