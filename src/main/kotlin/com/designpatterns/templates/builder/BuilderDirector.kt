package com.designpatterns.templates.builder

class BuilderDirector {
    fun buildProduct1(builder: Builder) {
        builder.reset()
        builder.buildStep1()
        builder.buildStep2()
    }

    fun buildProduct2(builder: Builder) {
        builder.reset()
        builder.buildStep1()
        builder.buildStep3()
    }
}