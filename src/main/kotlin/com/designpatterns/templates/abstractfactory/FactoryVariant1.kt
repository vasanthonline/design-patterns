package com.designpatterns.templates.abstractfactory

import com.designpatterns.templates.abstractfactory.implementations.FactoryItem1
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem1Variant1
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem2
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem2Variant1

class FactoryVariant1: FactoryInterface {
    override fun factoryItem1(): FactoryItem1 {
        return FactoryItem1Variant1()
    }

    override fun factoryItem2(): FactoryItem2 {
        return FactoryItem2Variant1()
    }
}