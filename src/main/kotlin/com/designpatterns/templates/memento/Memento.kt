package com.designpatterns.templates.memento

class Memento(private val param: String) {

    fun restore(): String {
        return "Restoring param: $param"
    }
}