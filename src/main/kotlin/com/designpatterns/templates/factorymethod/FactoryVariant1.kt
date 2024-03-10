package com.designpatterns.templates.factorymethod

class FactoryVariant1 : FactoryAbstractClass() {
    override fun factoryMethod(): FactoryInterface {
        return FactoryImplementation1()
    }
}