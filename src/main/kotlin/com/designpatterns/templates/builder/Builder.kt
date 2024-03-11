package com.designpatterns.templates.builder

interface Builder {

    fun reset()
    fun buildStep1()

    fun buildStep2()

    fun buildStep3()
}