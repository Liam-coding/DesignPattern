package org.itstack.structureModel.flyweightPattern;

import org.itstack.structureModel.flyweightPattern.util.RedisUtils;

public class ActivityController {
    private RedisUtils redisUtils = new RedisUtils();
    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
