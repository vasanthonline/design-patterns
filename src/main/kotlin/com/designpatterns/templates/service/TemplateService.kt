package com.designpatterns.templates.service

import com.designpatterns.templates.templates.TemplateVariant1
import com.designpatterns.templates.templates.TemplateVariant2
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class TemplateService {
    fun getTemplateImplementation(variant: String): Flux<String> {
        return when(variant) {
            "variant1" -> {
                val templateVariant1 = TemplateVariant1()
                Flux.merge(Mono.just(templateVariant1.run(variant)), Mono.just(templateVariant1.execute(variant)))
            }
            "variant2" -> {
                val templateVariant2 = TemplateVariant2()
                Flux.merge(Mono.just(templateVariant2.run(variant)), Mono.just(templateVariant2.execute(variant)))
            }

            else -> TODO("Not Implemented")
        }
    }
}