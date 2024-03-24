package com.designpatterns.templates.mediator

class ReceiverComponent(private val mediator: MediatorInterface) {

    fun receive(): String {
        return "Received param from mediator: ${mediator.get()}"
    }
}