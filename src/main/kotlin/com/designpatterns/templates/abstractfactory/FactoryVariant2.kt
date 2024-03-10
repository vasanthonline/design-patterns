package com.designpatterns.templates.abstractfactory

import com.designpatterns.templates.abstractfactory.implementations.FactoryItem1
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem1Variant2
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem2
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem2Variant2

class FactoryVariant2: FactoryInterface {
    override fun factoryItem1(): FactoryItem1 {
        return FactoryItem1Variant2()
    }

    override fun factoryItem2(): FactoryItem2 {
        return FactoryItem2Variant2()
    }
}