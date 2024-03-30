package com.designpatterns.templates.service

import com.designpatterns.templates.strategy.Executor
import com.designpatterns.templates.strategy.StrategyVariant1
import com.designpatterns.templates.strategy.StrategyVariant2
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class StrategyService {

    fun getStrategyImplementation(variant: String): Mono<String> {
        val executor = Executor()
        return Mono.just(when(variant) {
            "variant1" -> {
                executor.setStrategy(StrategyVariant1())
                executor.executeStrategy(variant)
            }
            "variant2" -> {
                executor.setStrategy(StrategyVariant2())
                executor.executeStrategy(variant)
            }

            else -> TODO("Not Implemented")
        })
    }
}