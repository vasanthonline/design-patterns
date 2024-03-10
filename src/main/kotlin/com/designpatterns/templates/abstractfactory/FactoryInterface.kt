package com.designpatterns.templates.abstractfactory

import com.designpatterns.templates.abstractfactory.implementations.FactoryItem1
import com.designpatterns.templates.abstractfactory.implementations.FactoryItem2

interface FactoryInterface {
    fun factoryItem1(): FactoryItem1

    fun factoryItem2(): FactoryItem2
}