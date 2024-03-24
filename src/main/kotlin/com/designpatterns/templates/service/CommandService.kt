package com.designpatterns.templates.service

import com.designpatterns.templates.command.Command1
import com.designpatterns.templates.command.Command2
import com.designpatterns.templates.command.CommandHistory
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class CommandService {
    fun getCommandImplementation(param: String): Flux<String> {
        val commandHistory = CommandHistory()
        val command1 = Command1()
        commandHistory.push(command1)
        val command2 = Command2()
        commandHistory.push(command2)
        val commandResults: MutableList<String> = mutableListOf()
        while(commandHistory.size() > 0) {
            val command = commandHistory.pop()
            commandResults.add(command.run(param))
        }
        return Flux.fromIterable(commandResults)
    }
}