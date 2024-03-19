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
    fun getDesignPattern(): RouterFunction<ServerResponse> {
        return router {
            BASE_URI.nest {
                GET(FACTORY_METHOD_URI).invoke { designPatternsHandler.getFactoryMethod(it) }
                GET(ABSTRACT_FACTORY_URI).invoke { designPatternsHandler.getAbstractFactory(it) }
                GET(BUILDER_URI).invoke { designPatternsHandler.getBuilder(it) }
                GET(PROTOTYPE_URI).invoke { designPatternsHandler.getPrototype(it) }
                GET(SINGLETON_URI).invoke { designPatternsHandler.getSingleton(it) }
                GET(ADAPTER_URI).invoke { designPatternsHandler.getAdapter(it) }
                GET(BRIDGE_URI).invoke { designPatternsHandler.getBridge(it) }
                GET(COMPOUND_URI).invoke { designPatternsHandler.getCompound(it) }
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
        const val ADAPTER_URI = "/adapter"
        const val BRIDGE_URI = "/bridge"
        const val COMPOUND_URI = "/compound"
    }
}