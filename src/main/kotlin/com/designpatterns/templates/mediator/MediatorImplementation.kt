package com.designpatterns.templates.mediator

class MediatorImplementation: MediatorInterface {

    private val params = mutableListOf<String>()
    override fun run(param: String) {
        params.add(param)
    }

    override fun get(): String {
        return params.removeAt(params.size - 1)
    }

}