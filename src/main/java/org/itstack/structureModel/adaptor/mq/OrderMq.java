package org.itstack.structureModel.adaptor.mq;

import java.util.Date;

public class OrderMq {
    private String uid;
    private String sku;
    private String orderId;
    private Date createOrderTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    @Override
    public String toString() {
        return String.format(
                "{\"uid\": \"%s\", \"sku\": \"%s\", \"orderId\": \"%s\", \"createOrderTime\": \"%s\"}",
                uid, sku, orderId, createOrderTime
        );
    }
}
