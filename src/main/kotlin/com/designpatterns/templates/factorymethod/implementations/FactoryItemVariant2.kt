package com.designpatterns.templates.factorymethod.implementations

import reactor.core.publisher.Mono

class FactoryItemVariant2 : FactoryItem {
    override fun run(variant: String): Mono<String> {
        return Mono.just("Factory Item for $variant")
    }
}