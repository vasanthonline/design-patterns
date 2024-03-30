package com.designpatterns.templates.state

class StateVariant1: State() {
    override fun run(param: String): String {
        return "Running state variant 1 with param $param"
    }
}