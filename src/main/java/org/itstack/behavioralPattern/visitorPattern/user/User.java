package org.itstack.behavioralPattern.visitorPattern.user;

import org.itstack.behavioralPattern.visitorPattern.visitor.Visitor;

public abstract class User {
    public String name;
    public String identity;// good class or bad class
    public String clazz; // class
    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    //core access method
    public abstract void accept(Visitor visitor);
}
