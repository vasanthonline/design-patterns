package com.designpatterns.templates.abstractfactory

import com.designpatterns.templates.abstractfactory.implementations.FactoryItem1
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem2
import reactor.core.publisher.Flux

class FactoryApplication(private val factory: FactoryInterface) {
    fun createFactoryItems(): Flux<String> {
        val factoryItem1: FactoryItem1 = factory.factoryItem1()
        val factoryItem2: FactoryItem2 = factory.factoryItem2()
        return Flux.merge(factoryItem1.run(), factoryItem2.run())
    }
}