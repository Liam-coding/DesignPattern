package org.itstack.behavioralPattern.observerPattern.event.listener;

import org.itstack.behavioralPattern.observerPattern.LotteryResult;

public interface EventListener {
    void doEvent(LotteryResult result);
}
