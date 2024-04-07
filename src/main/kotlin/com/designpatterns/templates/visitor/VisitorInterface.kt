package com.designpatterns.templates.visitor

interface VisitorInterface {
    fun visitElement1(visitorElement1: VisitorElement1): String
    fun visitElement2(visitorElement2: VisitorElement2): String
}