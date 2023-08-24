package org.itstack.structureModel.adaptor.impl;

import org.itstack.structureModel.adaptor.OrderAdapterService;
import org.itstack.structureModel.adaptor.service.POPOrderService;

public class POPOrderAdapterServiceImpl extends POPOrderService implements OrderAdapterService {
    public boolean isFirst(String uId) {
        return super.isFirstOrder(uId);
    }
}
