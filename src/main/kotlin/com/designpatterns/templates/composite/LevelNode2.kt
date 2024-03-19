package com.designpatterns.templates.composite

class LevelNode2(private val levelParameter: String): Leaf() {
    override fun run(x: Int): String {
        super.run(x)
        return "Running node 2 with x: $x and parameter: $levelParameter"
    }

    override fun print(y: Int): String {
        super.print(y)
        return "Printing node 2 with y: $y and parameter: $levelParameter"
    }
}