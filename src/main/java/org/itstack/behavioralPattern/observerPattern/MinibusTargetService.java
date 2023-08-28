package org.itstack.behavioralPattern.observerPattern;

public class MinibusTargetService {
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "Congratulates,code:".concat(uId).concat(",drawn in this lottery") :
                "Unfortunately,code:".concat(uId).concat(",don't drawn in this lottery");
    }
}
