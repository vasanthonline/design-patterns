package com.designpatterns.templates.adapter

import java.util.*

class VariantAdapter : Variant1 {

    private val variant2: Variant2

    constructor(variant2: Variant2) {
        this.variant2 = variant2
    }

    override fun getProperty(): String {
        return "Adaptor converted: ${this.variant2.getAnotherProperty()}"
    }
}