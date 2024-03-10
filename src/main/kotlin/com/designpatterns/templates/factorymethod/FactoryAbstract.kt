package com.designpatterns.templates.factorymethod

import com.designpatterns.templates.factorymethod.implementations.FactoryItem
import reactor.core.publisher.Mono

abstract class FactoryAbstract {
    abstract fun createFactoryItem(): FactoryItem

    fun render(variant: String): Mono<String> {
        val factoryMethod: FactoryItem = createFactoryItem()
        return factoryMethod.run(variant)
    }
}