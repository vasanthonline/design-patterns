package com.designpatterns.templates.prototype

class Prototype2(private val x: Int, private val z: Int): BasePrototype(x) {
    constructor(prototype2: Prototype2): this(prototype2.x, prototype2.z)

    override fun clone(): BasePrototype {
        return Prototype2(this)
    }

    override fun toString(): String {
        return "Prototype 2 has x: $x and z: $z."
    }
}