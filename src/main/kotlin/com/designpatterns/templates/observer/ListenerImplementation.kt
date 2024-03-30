package com.designpatterns.templates.observer

class ListenerImplementation: Listener {
    override fun listen(param: String): String {
        return "Listener received event with parameter $param"
    }
}