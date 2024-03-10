package com.designpatterns.templates.factorymethod

import reactor.core.publisher.Mono

interface FactoryInterface {
    fun run(variant: String): Mono<String>
}