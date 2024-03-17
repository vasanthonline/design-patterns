package com.designpatterns.templates.service

import com.designpatterns.templates.adapter.Variant1
import com.designpatterns.templates.adapter.Variant2
import com.designpatterns.templates.adapter.VariantAdapter
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class AdapterService {
    fun getAdapterImplementation(variant: String): Mono<String> {
        return Mono.just(when(variant) {
            "variant1" -> Variant1().getProperty()
            "variant2" -> Variant2().getAnotherProperty()
            "variant2tovariant1" -> VariantAdapter(Variant2()).getProperty()
            else -> TODO("Not Implemented")
        })
    }
}