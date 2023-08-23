package org.itstack.design_absturctFactory.factory.impl;

import org.itstack.design_absturctFactory.factory.ICacheAdapter;
import org.itstack.design_absturctFactory.factory.specImpl.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter extends IIR implements ICacheAdapter {

    @Override
    public String get(String key) {
        return super.gain(key);
    }

    @Override
    public void set(String key, String value) {
        super.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        super.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        super.del(key);
    }
}
