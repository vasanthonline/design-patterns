package com.designpatterns.templates.memento

class MementoImplementation {

    private var snapshot: String = ""
    fun save(param: String): Memento {
        snapshot = param
        return Memento("Saved param: $param")
    }
}