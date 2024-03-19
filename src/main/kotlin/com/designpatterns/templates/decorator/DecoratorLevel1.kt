package com.designpatterns.templates.decorator

open class DecoratorLevel1: DecoratorInterface {
    override fun run(param: String): String {
        return "Level 1 called with parameter: $param."
    }
}