package org.itstack.behavioralPattern.observerPattern.event;

import org.itstack.behavioralPattern.observerPattern.LotteryResult;
import org.itstack.behavioralPattern.observerPattern.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();
    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public enum EventType {
        MQ, Message
    }

    public void subscribe(Enum<EventType> eventType, EventListener
            listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(Enum<EventType> eventType, EventListener
            listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}
