package org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl;

import org.itstack.behavioralPattern.chainOfResponsibilityPattern.AuthInfo;
import org.itstack.behavioralPattern.chainOfResponsibilityPattern.AuthLink;

import java.util.Date;

public class Level1AuthLink extends AuthLink {

    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (date == null) {
            return new AuthInfo("0001", "number: ", orderId, "status: need level1 examine and approve", levelUserName);
        }
        AuthLink next = super.next();
        if (next == null) {
            return new AuthInfo("0000", "number: ", orderId, "status: finished level1 examine and approve", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
