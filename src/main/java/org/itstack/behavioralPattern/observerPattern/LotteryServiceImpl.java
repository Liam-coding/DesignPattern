package org.itstack.behavioralPattern.observerPattern;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {
    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        //call lottery api
        String lottery = minibusTargetService.lottery(uId);
        //result
        return new LotteryResult(uId, lottery, new Date());
    }
}
