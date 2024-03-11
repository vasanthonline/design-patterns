package com.designpatterns.templates.builder

import reactor.core.publisher.Flux

class BuilderProduct2: Builder {

    private val steps: MutableList<String> = ArrayList()

    override fun reset() {
        this.steps.clear()
    }
    override fun buildStep1() {
        this.steps.add("Step 1 of product 2")
    }

    override fun buildStep2() {
        this.steps.add("Step 2 of product 2")
    }

    override fun buildStep3() {
        this.steps.add("Step 3 of product 2")
    }

    fun getProduct(): Flux<String> {
        return Flux.fromIterable(this.steps)
    }
}