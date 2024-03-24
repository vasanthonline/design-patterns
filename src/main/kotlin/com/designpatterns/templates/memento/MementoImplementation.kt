package com.designpatterns.templates.memento

class MementoImplementation {
    fun save(param: String): Memento {
        return Memento("Saved param: $param")
    }
}