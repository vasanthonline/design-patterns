package com.designpatterns.templates.chainofresponsibility

class Level2(param: String): Level1(param) {
    override fun run(): String {
        return "Chain level 2. Calling ${super.run()}"
    }
}