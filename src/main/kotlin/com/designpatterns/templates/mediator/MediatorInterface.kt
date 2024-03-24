package com.designpatterns.templates.mediator

interface MediatorInterface {
    fun run(param: String)

    fun get(): String
}