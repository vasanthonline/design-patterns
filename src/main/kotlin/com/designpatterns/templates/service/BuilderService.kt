package com.designpatterns.templates.service

import com.designpatterns.templates.builder.BuilderDirector
import com.designpatterns.templates.builder.BuilderProduct1
import com.designpatterns.templates.builder.BuilderProduct2
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class BuilderService {
    fun getBuilderImplementation(variant: String): Flux<String> {
        val director = BuilderDirector()
        return when(variant) {
            "product1" -> {
                val builder = BuilderProduct1()
                director.buildProduct1(builder)
                builder.getProduct()
            }
            "product2" -> {
                val builder = BuilderProduct2()
                director.buildProduct2(builder)
                builder.getProduct()
            }
            else -> TODO("Not Implemented")
        }
    }
}