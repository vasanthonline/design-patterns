package com.designpatterns.templates.service

import com.designpatterns.templates.state.Runner
import com.designpatterns.templates.state.StateVariant1
import com.designpatterns.templates.state.StateVariant2
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class StateService {
    fun getStateImplementation(variant: String): Mono<String> {
        val runner = Runner()
        return Mono.just(when(variant) {
            "variant1" -> {
                runner.setState(StateVariant1())
                runner.run(variant)
            }
            "variant2" -> {
                runner.setState(StateVariant2())
                runner.run(variant)
            }

            else -> TODO("Not Implemented")
        })
    }
}