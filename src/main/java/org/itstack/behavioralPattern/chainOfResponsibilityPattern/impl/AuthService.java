package org.itstack.behavioralPattern.chainOfResponsibilityPattern.impl;

import org.itstack.behavioralPattern.chainOfResponsibilityPattern.AuthLink;

import java.util.Date;

public class AuthService {
    public static Date queryAuthInfo(String levelUserId, String orderId){
        return new Date();
    }

    public static void auth(AuthLink authLink, String levelUserId, String orderId){
        System.out.println("auth=====>: levelUserId:"+levelUserId+",orderId:"+orderId);
    }
}
