package org.itstack.design_abstractFactory;

import org.itstack.design_abstractFactory.factory.JDKProxy;
import org.itstack.design_abstractFactory.factory.impl.EGMCacheAdapter;
import org.itstack.design_abstractFactory.factory.impl.IIRCacheAdapter;
import org.itstack.design_abstractFactory.impl.CacheServiceImpl;
import org.junit.jupiter.api.Test;

public class Test01 {
    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new
                EGMCacheAdapter());
        proxy_EGM.set("user_name_01","egm_user_name_01");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);
        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new
                IIRCacheAdapter());
        proxy_IIR.set("user_name_01","llr_user_name_01");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }
}
