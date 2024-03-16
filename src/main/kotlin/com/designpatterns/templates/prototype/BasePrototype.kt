package com.designpatterns.templates.prototype

abstract class BasePrototype(private val x: Int) {

    constructor(base: BasePrototype) : this(base.x)

    abstract fun clone(): BasePrototype
}