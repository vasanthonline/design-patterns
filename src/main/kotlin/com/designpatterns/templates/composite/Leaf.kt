package com.designpatterns.templates.composite

open class Leaf: Base {
    override fun run(x: Int): String {
        return "Running leaf with x: $x"
    }

    override fun print(y: Int): String {
        return "Printing leaf with y: $y"
    }

}