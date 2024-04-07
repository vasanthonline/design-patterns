package com.designpatterns.templates.visitor

class VisitorElement1: VisitorElementInterface {
    override fun accept(visitor: Visitor): List<String> {
        return listOf("Visitor element 1 accepting a visitor", visitor.visitElement1(this))
    }
}