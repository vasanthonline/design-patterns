package com.designpatterns.templates.command

abstract class AbstractCommand {
    fun beforeRun(): String {
        return "Before run"
    }

    fun afterRun(): String {
        return "After run"
    }

    abstract fun run(param: String): String
}