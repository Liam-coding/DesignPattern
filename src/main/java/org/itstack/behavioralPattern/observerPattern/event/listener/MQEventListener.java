package org.itstack.behavioralPattern.observerPattern.event.listener;

import org.itstack.behavioralPattern.observerPattern.LotteryResult;

public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("record user:"+result.getuId()+
                "lottery result:"+result.getMsg());
    }
}
