package org.itstack.behavioralPattern.templatePattern;

import org.itstack.behavioralPattern.templatePattern.group.JDNetMall;
import org.junit.jupiter.api.Test;

public class TempkateTest {
    @Test
    public void test_NetMall() {
        NetMall netMall = new JDNetMall("1000001","*******");
        String base64 =
                netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        System.out.println("test result:"+base64);
    }
}
