package com.designpatterns.templates.web.routers

import com.designpatterns.templates.web.handler.FactoryMethodHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class FactoryMethodRouterConfig(
    private val factoryMethodHandler: FactoryMethodHandler
) {

    @Bean
    fun getRawTransactionDetail(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(FACTORY_MEMTHOD_URI).invoke { factoryMethodHandler.getFactoryImplementation(it) }
            }
        }
    }

    companion object {
        const val BASE_URI = "/api/design-patterns"
        const val FACTORY_MEMTHOD_URI = "/factory-method"
    }
}