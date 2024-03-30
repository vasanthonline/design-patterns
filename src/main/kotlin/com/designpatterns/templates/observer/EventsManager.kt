package com.designpatterns.templates.observer

class EventsManager {

    fun subscribe(eventType: String, listener: Listener): String {
        listeners[eventType] = listener
        return "Event $eventType subscribed with listener."
    }

    fun unsubscribe(eventType: String, listener: Listener): String {
        if(listeners.remove(eventType, listener))
            return "Event $eventType listener unsubscribed."
        return "Event $eventType listener could not be unsubscribed."
    }

    fun notify(eventType: String, param: String): List<String> {
        return listeners
            .filter { it.key == eventType }
            .map { it.value.listen(param) }
    }

    companion object {
        private val listeners = mutableMapOf<String, Listener>()
    }
}