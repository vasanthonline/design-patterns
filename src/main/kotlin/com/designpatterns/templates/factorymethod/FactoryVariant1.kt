package com.designpatterns.templates.factorymethod

import com.designpatterns.templates.factorymethod.implementations.FactoryItemVariant1
import com.designpatterns.templates.factorymethod.implementations.FactoryItem

class FactoryVariant1 : FactoryAbstract() {
    override fun createFactoryItem(): FactoryItem {
        return FactoryItemVariant1()
    }
}