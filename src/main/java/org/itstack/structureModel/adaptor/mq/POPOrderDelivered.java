package org.itstack.structureModel.adaptor.mq;

import java.math.BigDecimal;
import java.util.Date;

public class POPOrderDelivered {
    private String uId;
    private String orderId;
    private Date orderTime;
    private Date sku;
    private Date skuName;
    private BigDecimal decimal;

    @Override
    public String toString() {
        return String.format(
                "{\"uId\": \"%s\", \"orderId\": \"%s\", \"orderTime\": \"%s\", \"sku\": \"%s\", \"skuName\": \"%s\", \"decimal\": \"%s\"}",
                uId, orderId, orderTime, sku, skuName, decimal
        );
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSku() {
        return sku;
    }

    public void setSku(Date sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }
}
