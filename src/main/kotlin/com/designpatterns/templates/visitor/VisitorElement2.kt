package com.designpatterns.templates.visitor

class VisitorElement2: VisitorElementInterface {
    override fun accept(visitor: Visitor): List<String> {
        return listOf("Visitor element 2 accepting a visitor", visitor.visitElement2(this))
    }
}