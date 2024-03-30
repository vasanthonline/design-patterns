package com.designpatterns.templates.state

class StateVariant2: State() {
    override fun run(param: String): String {
        return "Running state variant 2 with param $param"
    }
}