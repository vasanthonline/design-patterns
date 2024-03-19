package com.designpatterns.templates.service

import com.designpatterns.templates.composite.Compound
import com.designpatterns.templates.composite.LevelNode1
import com.designpatterns.templates.composite.LevelNode2
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CompositeService {
    fun getCompositeImplementation(variant: String): Flux<String> {
        val node1 = LevelNode1(variant)
        val node2 = LevelNode2(variant)
        val compound = Compound()
        compound.add(node1)
        compound.add(node2)

        return Flux.merge(Mono.just(compound.run(1)), Mono.just(compound.print(2)))
    }
}