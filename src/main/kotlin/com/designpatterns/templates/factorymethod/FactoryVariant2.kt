package com.designpatterns.templates.factorymethod

class FactoryVariant2 : FactoryAbstractClass() {
    override fun factoryMethod(): FactoryInterface {
        return FactoryImplementation2()
    }
}