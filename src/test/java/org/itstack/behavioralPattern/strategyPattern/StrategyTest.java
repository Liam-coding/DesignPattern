package org.itstack.behavioralPattern.strategyPattern;

import org.itstack.behavioralPattern.strategyPattern.event.NYGCouponDiscount;
import org.itstack.behavioralPattern.strategyPattern.event.ZJCouponDiscount;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class StrategyTest {
    @Test
    public void test_zj() {
        Context<Double> context = new Context<Double>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new
                BigDecimal(100));
        System.out.println("dicountAmount:"+discountAmount);
    }

    @Test
    public void test_nyg() {
        Context<Double> context = new Context<Double>(new NYGCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(90D, new
                BigDecimal(100));
        System.out.println("dicountAmount:"+discountAmount);
    }
}
