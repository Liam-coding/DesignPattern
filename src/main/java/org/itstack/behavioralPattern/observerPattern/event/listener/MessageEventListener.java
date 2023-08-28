package org.itstack.behavioralPattern.observerPattern.event.listener;

import org.itstack.behavioralPattern.observerPattern.LotteryResult;

public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("send message to user:"+result.getuId()+
                "message:"+result.getMsg());
    }
}
