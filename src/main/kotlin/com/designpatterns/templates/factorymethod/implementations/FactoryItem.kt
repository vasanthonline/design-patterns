package com.designpatterns.templates.factorymethod.implementations

import reactor.core.publisher.Mono

interface FactoryItem {
    fun run(variant: String): Mono<String>
}