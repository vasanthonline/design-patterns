package com.designpatterns.templates.composite

class Compound: Base {

    private val nodes: MutableList<Base> = mutableListOf()

    fun add(base: Base) {
        this.nodes.add(base)
    }

    fun remove(base: Base) {
        this.nodes.remove(base)
    }

    override fun run(x: Int): String {
        return this.nodes.joinToString("; ") { it.run(x) }
    }

    override fun print(y: Int): String {
        return this.nodes.joinToString("; ") { it.print(y) }
    }
}