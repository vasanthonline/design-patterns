package com.designpatterns.templates.facade

class Facade {

    fun runAll(param: String): String {
        val base1Value = Base1().run(param)
        return Base2().run(base1Value)
    }
}