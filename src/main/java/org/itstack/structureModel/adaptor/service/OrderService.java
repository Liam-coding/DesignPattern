package org.itstack.structureModel.adaptor.service;

public class OrderService {
    public long queryUserOrderCount(String userId){
        System.out.println("Self-owned Merchant,query if the user order is the first one" + userId);
        return 10L;
    }
}
