package com.designpatterns.templates.state

class Runner {

    fun setState(state: State) {
        localState = state
    }

    fun run(param: String): String {
        return localState.run(param)
    }
    companion object {
        lateinit var localState: State
    }
}