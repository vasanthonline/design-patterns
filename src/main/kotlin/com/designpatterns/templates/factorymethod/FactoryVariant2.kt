package com.designpatterns.templates.factorymethod

import com.designpatterns.templates.factorymethod.implementations.FactoryItemVariant2
import com.designpatterns.templates.factorymethod.implementations.FactoryItem

class FactoryVariant2 : FactoryAbstract() {
    override fun createFactoryItem(): FactoryItem {
        return FactoryItemVariant2()
    }
}