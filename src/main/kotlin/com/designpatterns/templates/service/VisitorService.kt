package com.designpatterns.templates.service

import com.designpatterns.templates.visitor.Visitor
import com.designpatterns.templates.visitor.VisitorElement1
import com.designpatterns.templates.visitor.VisitorElement2
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class VisitorService {
    fun getVisitorImplementation(variant: String): Flux<String> {
        val visitor = Visitor()
        return when(variant) {
            "variant1" -> Flux.fromIterable(VisitorElement1().accept(visitor))
            "variant2" -> Flux.fromIterable(VisitorElement2().accept(visitor))
            else -> TODO("Not Implemented")
        }
    }
}