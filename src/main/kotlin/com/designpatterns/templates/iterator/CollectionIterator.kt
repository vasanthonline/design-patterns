package com.designpatterns.templates.iterator

interface CollectionIterator {

    fun init()
    fun hasNext(): Boolean

    fun getNext(): String
}