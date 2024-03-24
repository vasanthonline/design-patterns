package com.designpatterns.templates.web.handler

import com.designpatterns.templates.service.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Mono

@Component
class DesignPatternsHandler(
    private val factoryMethodService: FactoryMethodService,
    private val abstractFactoryService: AbstractFactoryService,
    private val builderService: BuilderService,
    private val prototypeService: PrototypeService,
    private val singletonService: SingletonService,
    private val adapterService: AdapterService,
    private val bridgeService: BridgeService,
    private val compositeService: CompositeService,
    private val decoratorService: DecoratorService,
    private val facadeService: FacadeService,
    private val flyweightService: FlyweightService,
) {
    fun getFactoryMethod(serverRequest: ServerRequest): Mono<ServerResponse> {
        return factoryMethodService
            .getFactoryImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                .body(BodyInserters.fromValue(it))
            }
    }

    fun getAbstractFactory(serverRequest: ServerRequest): Mono<ServerResponse> {
        return abstractFactoryService
            .getFactoryImplementation(readVariant(serverRequest))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(it))
            }
    }

    fun getBuilder(serverRequest: ServerRequest): Mono<ServerResponse> {
        return builderService
            .getBuilderImplementation(readVariant(serverRequest))
            .collectList().flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getPrototype(serverRequest: ServerRequest): Mono<ServerResponse> {
        return prototypeService
            .getPrototypeImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getSingleton(serverRequest: ServerRequest): Mono<ServerResponse> {
        return singletonService
            .getSingletonImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getAdapter(serverRequest: ServerRequest): Mono<ServerResponse> {
        return adapterService
            .getAdapterImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getBridge(serverRequest: ServerRequest): Mono<ServerResponse> {
        return bridgeService
            .getBridgeImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getComposite(serverRequest: ServerRequest): Mono<ServerResponse> {
        return compositeService
            .getCompositeImplementation(readVariant(serverRequest))
            .collectList().flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getDecorator(serverRequest: ServerRequest): Mono<ServerResponse> {
        return decoratorService
            .getDecoratorImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getFacade(serverRequest: ServerRequest): Mono<ServerResponse> {
        return facadeService
            .getFacadeImplementation(readVariant(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getFlyweight(serverRequest: ServerRequest): Mono<ServerResponse> {
        return flyweightService
            .getFlyweightImplementation()
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun readVariant(serverRequest: ServerRequest): String {
        return serverRequest.queryParam("variant")
            .orElseThrow {
                ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "'variant' is either missing or invalid."
                )
            }
    }
}