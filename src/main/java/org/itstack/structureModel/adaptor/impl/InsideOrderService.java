package org.itstack.structureModel.adaptor.impl;

import org.itstack.structureModel.adaptor.OrderAdapterService;
import org.itstack.structureModel.adaptor.service.OrderService;

public class InsideOrderService extends OrderService implements OrderAdapterService {
    public boolean isFirst(String uId) {
        return super.queryUserOrderCount(uId) <= 1;
    }
}