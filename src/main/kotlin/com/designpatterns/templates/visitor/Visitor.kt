package com.designpatterns.templates.visitor

class Visitor: VisitorInterface {
    override fun visitElement1(visitorElement1: VisitorElement1): String {
        return "Running visitor with visitor element 1"
    }

    override fun visitElement2(visitorElement2: VisitorElement2): String {
        return "Running visitor with visitor element 2"
    }
}