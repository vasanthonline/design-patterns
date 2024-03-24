package com.designpatterns.templates.proxy

class ProxyImplementation(private val baseImplementation: BaseImplementation): BaseInterface {

    override fun run(variant: String): String {
        return "Proxied: ${baseImplementation.run(variant)}"
    }
}