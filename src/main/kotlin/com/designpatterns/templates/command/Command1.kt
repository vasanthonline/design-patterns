package com.designpatterns.templates.command

class Command1: AbstractCommand() {
    override fun run(param: String): String {
        return "Command 1: ${super.beforeRun()}. Running with param: $param. ${super.afterRun()}"
    }
}