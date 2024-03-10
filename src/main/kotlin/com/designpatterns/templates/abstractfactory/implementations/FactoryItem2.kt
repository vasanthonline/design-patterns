package com.designpatterns.templates.abstractfactory.implementations

import reactor.core.publisher.Mono

interface FactoryItem2 {
    fun run(): Mono<String>
}