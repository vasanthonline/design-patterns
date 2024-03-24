package com.designpatterns.templates.command

class CommandHistory {

    private val commands: MutableList<AbstractCommand> = mutableListOf()
    fun push(command: AbstractCommand) {
        commands.add(command)
    }

    fun pop(): AbstractCommand {
        return commands.removeAt(commands.size - 1)
    }

    fun size(): Int {
        return commands.size
    }
}