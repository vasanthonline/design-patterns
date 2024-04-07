package com.designpatterns.templates.templates

abstract class BaseTemplate {

    open fun run(param: String): String {
        return "Running from base template with param: $param"
    }

    abstract fun execute(param: String): String
}