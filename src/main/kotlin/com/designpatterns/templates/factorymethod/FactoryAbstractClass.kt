package com.designpatterns.templates.factorymethod

abstract class Dialog {
    abstract fun createButton(): Button

    fun render() {
        val okButton: Button = createButton()
        okButton.render()
    }
}