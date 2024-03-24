package com.designpatterns.templates.service

import com.designpatterns.templates.proxy.BaseImplementation
import com.designpatterns.templates.proxy.ProxyImplementation
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ProxyService {
    fun getProxyImplementation(variant: String): Mono<String> {
        val base = BaseImplementation()
        val proxy = ProxyImplementation(base)
        return Mono.just(proxy.run(variant))
    }
}