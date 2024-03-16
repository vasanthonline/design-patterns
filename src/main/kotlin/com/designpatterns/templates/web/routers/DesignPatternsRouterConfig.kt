package com.designpatterns.templates.web.routers

import com.designpatterns.templates.web.handler.DesignPatternsHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class DesignPatternsRouterConfig(
    private val designPatternsHandler: DesignPatternsHandler
) {

    @Bean
    fun getFactoryMethod(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(FACTORY_METHOD_URI).invoke { designPatternsHandler.getFactoryMethod(it) }
            }
        }
    }

    @Bean
    fun getAbstractFactory(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(ABSTRACT_FACTORY_URI).invoke { designPatternsHandler.getAbstractFactory(it) }
            }
        }
    }

    @Bean
    fun getBuilder(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(BUILDER_URI).invoke { designPatternsHandler.getBuilder(it) }
            }
        }
    }

    @Bean
    fun getPrototype(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(PROTOTYPE_URI).invoke { designPatternsHandler.getPrototype(it) }
            }
        }
    }

    @Bean
    fun getSingleton(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(SINGLETON_URI).invoke { designPatternsHandler.getSingleton(it) }
            }
        }
    }

    companion object {
        const val BASE_URI = "/api/design-patterns"
        const val FACTORY_METHOD_URI = "/factory-method"
        const val ABSTRACT_FACTORY_URI = "/abstract-factory"
        const val BUILDER_URI = "/builder"
        const val PROTOTYPE_URI = "/prototype"
        const val SINGLETON_URI = "/singleton"
    }
}