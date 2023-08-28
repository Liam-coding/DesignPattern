package org.itstack.behavioralPattern.observerPattern;

import org.itstack.behavioralPattern.observerPattern.event.EventManager;
import org.itstack.behavioralPattern.observerPattern.event.listener.MQEventListener;
import org.itstack.behavioralPattern.observerPattern.event.listener.MessageEventListener;

public abstract class LotteryService {
    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        //call what method what you need
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);
}
