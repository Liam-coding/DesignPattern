package org.itstack.design_absturctFactory.impl;

import org.itstack.design_absturctFactory.CacheService;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public void set(String key, String value) {
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
    }

    @Override
    public void del(String key) {
    }
}
