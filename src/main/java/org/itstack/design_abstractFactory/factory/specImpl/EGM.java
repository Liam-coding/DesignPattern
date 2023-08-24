package org.itstack.design_abstractFactory.factory.specImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class EGM {

    private Map<String,String> dataMap = new HashMap<>();

    public String gain(String key){
        System.out.println("EGM gain...");
        return dataMap.get(key);
    }

    public void set(String key,String setValue){
        System.out.println("EGM set...");
        dataMap.put(key,setValue);
    }

    public void setEX(String key, String setValue, long timeout, TimeUnit timeUnit){
        System.out.println("EGM setEX...");
        dataMap.put(key,setValue);
    }

    public void delete(String key){
        System.out.println("EGM delete...");
        dataMap.remove(key);
    }


}
