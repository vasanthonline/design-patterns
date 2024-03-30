package com.designpatterns.templates.state

abstract class State {
    abstract fun run(param: String): String
}