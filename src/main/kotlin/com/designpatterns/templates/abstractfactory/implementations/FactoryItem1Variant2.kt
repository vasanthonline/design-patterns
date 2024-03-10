package com.designpatterns.templates.abstractfactory.implementations

import reactor.core.publisher.Mono

class FactoryItem1Variant2: FactoryItem1 {
    override fun run(): Mono<String> {
        return Mono.just("Factory Item 1 for variant 2")
    }
}