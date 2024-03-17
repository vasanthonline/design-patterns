package com.designpatterns.templates.bridge

abstract class Abstraction(private val implementation: ImplementationInterface) {
    fun setImplementationProperty(property: String) {
        implementation.setProperty(property)
    }

    fun getImplementationProperty(): String {
        return "Property from Abstraction: ${implementation.getProperty()}"
    }
}