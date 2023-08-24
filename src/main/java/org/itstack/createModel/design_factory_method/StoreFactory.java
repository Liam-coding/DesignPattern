package org.itstack.createModel.design_factory_method;

import org.itstack.createModel.design_factory_method.store.impl.CouponCommodityService;
import org.itstack.createModel.design_factory_method.store.impl.GoodsCommodityService;
import org.itstack.createModel.design_factory_method.store.ICommodity;
import org.itstack.createModel.design_factory_method.store.impl.CardCommodityService;

public class StoreFactory {
    public ICommodity getCommodityService(String methodName){
        switch (methodName) {
            case "CardCommodityService" -> {
                return new CardCommodityService();
            }
            case "CouponCommodityService" -> {
                return new CouponCommodityService();
            }
            case "GoodsCommodityService" -> {
                return new GoodsCommodityService();
            }
        }
        throw new RuntimeException("the service type not existed.");
    }
}
