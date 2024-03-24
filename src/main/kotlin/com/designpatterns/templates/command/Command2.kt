package com.designpatterns.templates.command

class Command2: AbstractCommand() {
    override fun run(param: String): String {
        return "Command 2: ${super.beforeRun()}. Running with param: $param. ${super.afterRun()}"
    }
}