package com.designpatterns.templates.service

import com.designpatterns.templates.flyweight.FlyweightFactory
import com.designpatterns.templates.flyweight.Variant
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class FlyweightService {
    fun getFlyweightImplementation(): Flux<String> {
        val factory = FlyweightFactory()
        val base1 = factory.getBase("param1", "param2")
        val base2 = factory.getBase("param3", "param4")
        return Flux.fromIterable(listOf(Variant(base1).run(), Variant(base2).run()))
    }
}