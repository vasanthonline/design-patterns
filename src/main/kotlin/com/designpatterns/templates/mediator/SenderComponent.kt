package com.designpatterns.templates.mediator

class SenderComponent(private val mediator: MediatorInterface) {

    fun send(param: String): String {
        mediator.run(param)
        return "Sending param: $param to mediator"
    }
}