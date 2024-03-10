package com.designpatterns.templates.web.handler

import com.designpatterns.templates.service.FactoryMethodService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Mono

@Component
class FactoryMethodHandler(
    private val factoryMethodService: FactoryMethodService
) {
    fun getFactoryImplementation(serverRequest: ServerRequest): Mono<ServerResponse> {
        val variant = serverRequest.queryParam("variant")
            .orElseThrow {
                ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "'variant' is either missing or invalid."
                )
            }
        return factoryMethodService.getFactoryImplementation(variant).flatMap {
            ServerResponse.status(HttpStatus.OK)
                .body(BodyInserters.fromValue(it))
        }
    }
}