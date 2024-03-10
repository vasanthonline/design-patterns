package com.designpatterns.templates.service

import com.designpatterns.templates.factorymethod.FactoryVariant1
import com.designpatterns.templates.factorymethod.FactoryVariant2
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class FactoryMethodService {

    fun getFactoryImplementation(variant: String): Mono<String> {
        return when(variant) {
            "factory1" -> FactoryVariant1().render(variant)
            "factory2" -> FactoryVariant2().render(variant)
            else -> TODO("Not Implemented")
        }
    }
}