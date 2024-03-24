package com.designpatterns.templates.chainofresponsibility

abstract class AbstractBase(private val param: String): BaseOfChain {
    override fun run(): String {
        return "Base of chain with param: $param"
    }
}