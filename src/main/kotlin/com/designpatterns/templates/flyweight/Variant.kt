package com.designpatterns.templates.flyweight

class Variant(private val base: VariantBase) {

    fun run(): String {
        return base.run()
    }
}