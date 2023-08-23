package org.itstack.design_absturctFactory.factory.specImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class IIR {
    private Map<String,String> dataMap = new HashMap<>();

    public String gain(String key){
        System.out.println("IIR gain...");
        return dataMap.get(key);
    }

    public void set(String key,String setValue){
        System.out.println("IIR set...");
        dataMap.put(key,setValue);
    }

    public void setExpire(String key, String setValue, long timeout, TimeUnit timeUnit){
        System.out.println("IIR setExpire...");
        dataMap.put(key,setValue);
    }

    public void del(String key){
        System.out.println("IIR del...");
        dataMap.remove(key);
    }
}
