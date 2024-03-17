package com.designpatterns.templates.bridge

class ImplementationVariant1: ImplementationInterface {
    private lateinit var property: String
    override fun setProperty(property: String) {
        this.property = property
    }

    override fun getProperty(): String {
        return this.property
    }
}