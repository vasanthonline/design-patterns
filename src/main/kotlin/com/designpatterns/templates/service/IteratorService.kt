package com.designpatterns.templates.service

import com.designpatterns.templates.iterator.CollectionIteratorImplementation
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class IteratorService {

    fun getIteratorImplementation(param: String): Flux<String> {
        val iterator = CollectionIteratorImplementation()
        iterator.init()
        val iteratorResults = mutableListOf<String>()
        while(iterator.hasNext()) {
            iteratorResults.add(iterator.getNext())
        }
        return Flux.fromIterable(iteratorResults)
    }
}