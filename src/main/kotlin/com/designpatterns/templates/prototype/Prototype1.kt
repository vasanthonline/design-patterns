package com.designpatterns.templates.prototype

class Prototype1(private val x: Int, private val y: Int): BasePrototype(x) {

    constructor(prototype1: Prototype1): this(prototype1.x, prototype1.y)

    override fun clone(): BasePrototype {
        return Prototype1(this)
    }

    override fun toString(): String {
        return "Prototype 1 has x: $x and y: $y."
    }
}