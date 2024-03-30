package com.designpatterns.templates.service

import com.designpatterns.templates.observer.EventsManager
import com.designpatterns.templates.observer.ListenerImplementation
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class ObserverService {
    fun getObserverImplementation(param: String): Flux<String> {
        val eventsManager = EventsManager()
        val evensList = mutableListOf<String>()
        val listener = ListenerImplementation()
        evensList.add(eventsManager.subscribe("notify", listener))
        evensList.addAll( eventsManager.notify("notify", param))
        evensList.add(eventsManager.unsubscribe("notify", listener))
        return Flux.fromIterable(evensList)
    }
}