package org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl;

import org.itstack.behavioralPattern.chainOfResponsibilityPattern.AuthInfo;
import org.itstack.behavioralPattern.chainOfResponsibilityPattern.AuthLink;

import java.text.ParseException;
import java.util.Date;

public class Level2AuthLink extends AuthLink{

    private Date beginDate = f.parse("2020-06-11 00:00:00");
    private Date endDate = f.parse("2023-09-20 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (date == null) {
            return new AuthInfo("0001", "number: ", orderId, "status: need level2 examine and approve", levelUserName);
        }
        AuthLink next = super.next();
        if (next == null) {
            return new AuthInfo("0000", "number: ", orderId, "status: finished level2 examine and approve","people: ", levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "number: ", orderId, "status: finished level2 examine and approve", "people: ",levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }
}
