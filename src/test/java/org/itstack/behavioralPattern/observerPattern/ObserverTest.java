package org.itstack.behavioralPattern.observerPattern;

import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    public void test(){
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109877");
        System.out.println("test result:"+JSON.toJSONString(result));
    }
}
