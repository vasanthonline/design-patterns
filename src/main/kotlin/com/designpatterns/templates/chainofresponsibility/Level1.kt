package com.designpatterns.templates.chainofresponsibility

open class Level1(param: String): AbstractBase(param) {
    override fun run(): String {
        return "Chain level 1. Calling ${super.run()}"
    }
}