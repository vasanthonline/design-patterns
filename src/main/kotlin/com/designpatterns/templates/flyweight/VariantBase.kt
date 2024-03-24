package com.designpatterns.templates.flyweight

class VariantBase(private val baseParam1: String, private val baseParam2: String) {
    fun run():String {
        return "Variant base received parameters: $baseParam1, $baseParam2"
    }
}