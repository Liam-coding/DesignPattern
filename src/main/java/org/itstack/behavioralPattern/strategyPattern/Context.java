package org.itstack.behavioralPattern.strategyPattern;

import java.math.BigDecimal;

public class Context<T> {
    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> iCouponDiscount) {
        this.couponDiscount = iCouponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
