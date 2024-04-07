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
    private val proxyService: ProxyService,
    private val chainOfResponsibilityService: ChainOfResponsibilityService,
    private val commandService: CommandService,
    private val iteratorService: IteratorService,
    private val mediatorService: MediatorService,
    private val mementoService: MementoService,
    private val observerService: ObserverService,
    private val stateService: StateService,
    private val strategyService: StrategyService,
    private val templateService: TemplateService,
    private val visitorService: VisitorService
) {
    fun getFactoryMethod(serverRequest: ServerRequest): Mono<ServerResponse> {
        return factoryMethodService
            .getFactoryImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                .body(BodyInserters.fromValue(it))
            }
    }

    fun getAbstractFactory(serverRequest: ServerRequest): Mono<ServerResponse> {
        return abstractFactoryService
            .getFactoryImplementation(readQueryParam(serverRequest))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(it))
            }
    }

    fun getBuilder(serverRequest: ServerRequest): Mono<ServerResponse> {
        return builderService
            .getBuilderImplementation(readQueryParam(serverRequest))
            .collectList().flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getPrototype(serverRequest: ServerRequest): Mono<ServerResponse> {
        return prototypeService
            .getPrototypeImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getSingleton(serverRequest: ServerRequest): Mono<ServerResponse> {
        return singletonService
            .getSingletonImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getAdapter(serverRequest: ServerRequest): Mono<ServerResponse> {
        return adapterService
            .getAdapterImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getBridge(serverRequest: ServerRequest): Mono<ServerResponse> {
        return bridgeService
            .getBridgeImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getComposite(serverRequest: ServerRequest): Mono<ServerResponse> {
        return compositeService
            .getCompositeImplementation(readQueryParam(serverRequest))
            .collectList().flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getDecorator(serverRequest: ServerRequest): Mono<ServerResponse> {
        return decoratorService
            .getDecoratorImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getFacade(serverRequest: ServerRequest): Mono<ServerResponse> {
        return facadeService
            .getFacadeImplementation(readQueryParam(serverRequest))
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

    fun getProxy(serverRequest: ServerRequest): Mono<ServerResponse> {
        return proxyService
            .getProxyImplementation(readQueryParam(serverRequest))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getChainOfResponsibility(serverRequest: ServerRequest): Mono<ServerResponse> {
        return chainOfResponsibilityService
            .getChainOfResponsibilityImplementation(readQueryParam(serverRequest, "parameter"))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getCommand(serverRequest: ServerRequest): Mono<ServerResponse> {
        return commandService
            .getCommandImplementation(readQueryParam(serverRequest, "parameter"))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getIterator(serverRequest: ServerRequest): Mono<ServerResponse> {
        return iteratorService
            .getIteratorImplementation(readQueryParam(serverRequest, "parameter"))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getMediator(serverRequest: ServerRequest): Mono<ServerResponse> {
        return mediatorService
            .getMediatorImplementation(readQueryParam(serverRequest, "parameter"))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getMemento(serverRequest: ServerRequest): Mono<ServerResponse> {
        return mementoService
            .getMementoImplementation(readQueryParam(serverRequest, "parameter"))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getObserver(serverRequest: ServerRequest): Mono<ServerResponse> {
        return observerService
            .getObserverImplementation(readQueryParam(serverRequest, "parameter"))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getState(serverRequest: ServerRequest): Mono<ServerResponse> {
        return stateService
            .getStateImplementation(readQueryParam(serverRequest, "variant"))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getStrategy(serverRequest: ServerRequest): Mono<ServerResponse> {
        return strategyService
            .getStrategyImplementation(readQueryParam(serverRequest, "variant"))
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getTemplate(serverRequest: ServerRequest): Mono<ServerResponse> {
        return templateService
            .getTemplateImplementation(readQueryParam(serverRequest, "variant"))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun getVisitor(serverRequest: ServerRequest): Mono<ServerResponse> {
        return visitorService
            .getVisitorImplementation(readQueryParam(serverRequest, "variant"))
            .collectList()
            .flatMap {
                ServerResponse.status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromValue(it))
            }
    }

    fun readQueryParam(serverRequest: ServerRequest, parameterName: String = "variant"): String {
        return serverRequest.queryParam(parameterName)
            .orElseThrow {
                ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "'variant' is either missing or invalid."
                )
            }
    }
}