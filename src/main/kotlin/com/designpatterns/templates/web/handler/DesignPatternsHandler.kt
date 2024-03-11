package com.designpatterns.templates.web.handler

import com.designpatterns.templates.service.AbstractFactoryService
import com.designpatterns.templates.service.BuilderService
import com.designpatterns.templates.service.FactoryMethodService
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
    private val builderService: BuilderService
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