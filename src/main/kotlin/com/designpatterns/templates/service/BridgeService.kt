package com.designpatterns.templates.service

import com.designpatterns.templates.bridge.AbstractImplementation
import com.designpatterns.templates.bridge.ImplementationVariant1
import com.designpatterns.templates.bridge.ImplementationVariant2
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class BridgeService {
    fun getBridgeImplementation(variant: String): Mono<String> {
        return Mono.just(when(variant) {
            "variant1" -> {
                val variant1 = AbstractImplementation(ImplementationVariant1())
                variant1.setImplementationProperty(variant)
                variant1.getImplementationProperty()
            }
            "variant2" -> {
                val variant2 = AbstractImplementation(ImplementationVariant2())
                variant2.setImplementationProperty(variant)
                variant2.getImplementationProperty()
            }
            else -> TODO("Not Implemented")
        })
    }
}