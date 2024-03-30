package com.designpatterns.templates.strategy

class Executor {
    fun setStrategy(strategy: Strategy) {
        localStrategy = strategy
    }

    fun executeStrategy(param: String): String {
        return localStrategy.execute(param)
    }

    companion object {
        lateinit var localStrategy: Strategy
    }
}