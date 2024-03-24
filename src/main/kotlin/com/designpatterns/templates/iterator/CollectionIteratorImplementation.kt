package com.designpatterns.templates.iterator

class CollectionIteratorImplementation: CollectionIterator {

    private val dataClasses = mutableListOf<DataClass>()
    private var currentPosition = 0
    override fun init() {
        for (i in 1..5){
            dataClasses.add(DataClass("param$i"))
        }
    }
    override fun hasNext(): Boolean {
        return currentPosition < dataClasses.size
    }

    override fun getNext(): String {
        val dataClass = dataClasses[currentPosition]
        currentPosition++
        return "Processing next item from Iterator: ${dataClass.param1}"
    }
}