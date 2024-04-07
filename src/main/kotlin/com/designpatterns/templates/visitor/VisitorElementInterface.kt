package com.designpatterns.templates.visitor

interface VisitorElementInterface {
    fun accept(visitor: Visitor): List<String>
}