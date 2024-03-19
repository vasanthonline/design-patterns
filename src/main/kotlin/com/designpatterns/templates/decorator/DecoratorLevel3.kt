package com.designpatterns.templates.decorator

class DecoratorLevel3: DecoratorLevel2() {

    override fun run(param: String): String {
        return super.run("Level 3 called with parameter: $param")
    }

}