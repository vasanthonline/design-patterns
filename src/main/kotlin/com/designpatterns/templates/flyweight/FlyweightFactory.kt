package com.designpatterns.templates.flyweight

import kotlin.run

class FlyweightFactory {
    private var variantBases: MutableList<Triple<String, String, VariantBase>> = mutableListOf()

    fun getBase(param1: String, param2: String): VariantBase {
        return variantBases.firstOrNull {
                it.first == param1 && it.second == param2
            }?.third ?: run {
            val base = VariantBase(param1, param2)
            variantBases.add(Triple(param1, param2, base))
            base
        }
    }
}