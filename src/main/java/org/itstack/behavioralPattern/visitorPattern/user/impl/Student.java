package org.itstack.behavioralPattern.visitorPattern.user.impl;

import org.itstack.behavioralPattern.visitorPattern.user.User;
import org.itstack.behavioralPattern.visitorPattern.visitor.Visitor;

public class Student extends User {
    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
