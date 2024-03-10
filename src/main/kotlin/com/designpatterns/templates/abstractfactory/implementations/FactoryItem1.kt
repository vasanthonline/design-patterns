package com.designpatterns.templates.abstractfactory.implementations

import reactor.core.publisher.Mono

interface FactoryItem1 {
    fun run(): Mono<String>
}