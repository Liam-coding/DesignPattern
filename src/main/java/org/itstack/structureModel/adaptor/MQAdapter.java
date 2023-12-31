package org.itstack.structureModel.adaptor;

import com.alibaba.fastjson2.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            try {
                RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, String.valueOf(val));
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                // Handle exceptions as needed
                e.printStackTrace();
            }
        }
        return rebateInfo;
    }
}
