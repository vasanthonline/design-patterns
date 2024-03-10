package com.designpatterns.templates.factorymethod

import reactor.core.publisher.Mono

abstract class FactoryAbstractClass {
    abstract fun factoryMethod(): FactoryInterface

    fun render(variant: String): Mono<String> {
        val factoryMethod: FactoryInterface = factoryMethod()
        return factoryMethod.run(variant)
    }
}