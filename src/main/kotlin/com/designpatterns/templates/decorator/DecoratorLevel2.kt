package com.designpatterns.templates.decorator

open class DecoratorLevel2: DecoratorLevel1() {

    override fun run(param: String): String {
        return super.run("Level 2 called with parameter: $param")
    }

}