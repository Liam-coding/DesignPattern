package org.itstack.behavioralPattern.chainOfResponsibilityPattern;

import com.alibaba.fastjson2.JSON;
import org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl.AuthService;
import org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl.Level1AuthLink;
import org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl.Level2AuthLink;
import org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl.Level3AuthLink;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

public class test_AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    @Test
    public void test_AuthLink() throws ParseException {
        AuthLink authLink = new Level3AuthLink("1000013", "wang gong")
                .appendNext(new Level2AuthLink("1000012", "zhang manger")
                .appendNext(new Level1AuthLink("1000011", "CEO")));
        logger.info("result:{}", JSON.toJSONString(authLink.doAuth("James", "1000998004813441", new Date())));

        AuthService.auth( authLink,"1000013", "1000998004813441");
        logger.info("result:{}", "mock level3");
        logger.info("result:{}", JSON.toJSONString(authLink.doAuth("James", "1000998004813441", new Date())));

        AuthService.auth(authLink, "1000012", "1000998004813441");
        logger.info("result:{}", "mock level2");
        logger.info("result:{}", JSON.toJSONString(authLink.doAuth("James", "1000998004813441", new Date())));

        AuthService.auth(authLink, "1000011", "1000998004813441");
        logger.info("result:{}", "mock level1");
        logger.info("result:{}", JSON.toJSONString(authLink.doAuth("James", "1000998004813441", new Date())));
    }
}
