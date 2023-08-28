package org.itstack.behavioralPattern.visitorPattern.user.impl;

import org.itstack.behavioralPattern.visitorPattern.user.User;
import org.itstack.behavioralPattern.visitorPattern.visitor.Visitor;

import java.math.BigDecimal;

public class Teacher extends User {
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // rate of entrance
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
