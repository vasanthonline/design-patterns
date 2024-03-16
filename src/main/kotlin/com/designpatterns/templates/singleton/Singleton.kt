package com.designpatterns.templates.singleton

class Singleton(private val x: String) {

    override fun toString(): String {
        return "Singleton has x: $x."
    }
    companion object {
        private var singletonField: Singleton? = null
        fun create(y: String): Singleton = singletonField ?: run {
            singletonField = Singleton(y)
            return singletonField as Singleton
        }
    }
}