package org.itstack.behavioralPattern.strategyPattern;

import java.math.BigDecimal;

public interface ICouponDiscount<T> {
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
