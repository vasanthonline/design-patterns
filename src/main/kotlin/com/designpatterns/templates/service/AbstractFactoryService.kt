package com.designpatterns.templates.service

import com.designpatterns.templates.abstractfactory.FactoryApplication
import com.designpatterns.templates.abstractfactory.FactoryVariant1
import com.designpatterns.templates.abstractfactory.FactoryVariant2
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class AbstractFactoryService {
    fun getFactoryImplementation(variant: String): Flux<String> {
        return when(variant) {
            "factory1" -> FactoryApplication(FactoryVariant1()).createFactoryItems()
            "factory2" -> FactoryApplication(FactoryVariant2()).createFactoryItems()
            else -> TODO("Not Implemented")
        }
    }
}