package org.itstack.createModel.design_abstractFactory.factory.impl;

import org.itstack.createModel.design_abstractFactory.factory.ICacheAdapter;
import org.itstack.createModel.design_abstractFactory.factory.specImpl.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter extends EGM implements ICacheAdapter {

    @Override
    public String get(String key) {
        return super.gain(key);
    }

    @Override
    public void set(String key, String value) {
        super.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        super.setEX(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        super.delete(key);
    }
}
