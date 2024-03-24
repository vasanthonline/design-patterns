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
                GET(COMPOSITE_URI).invoke { designPatternsHandler.getComposite(it) }
                GET(DECORATOR_URI).invoke { designPatternsHandler.getDecorator(it) }
                GET(FACADE_URI).invoke { designPatternsHandler.getFacade(it) }
                GET(FLYWEIGHT_URI).invoke { designPatternsHandler.getFlyweight(it) }
                GET(PROXY_URI).invoke { designPatternsHandler.getProxy(it) }
                GET(CHAIN_OF_RESPONSIBILITY_URI).invoke { designPatternsHandler.getChainOfResponsibility(it) }
                GET(COMMAND_URI).invoke { designPatternsHandler.getCommand(it) }
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
        const val COMPOSITE_URI = "/composite"
        const val DECORATOR_URI = "/decorator"
        const val FACADE_URI = "/facade"
        const val FLYWEIGHT_URI = "/flyweight"
        const val PROXY_URI = "/proxy"
        const val CHAIN_OF_RESPONSIBILITY_URI = "/chain-of-responsibility"
        const val COMMAND_URI = "/command"
    }
}