package org.itstack.createModel.singlePattern;

/**
 * Thread safe, but consume a lot of resources.
 * */
public class EagerSingletonPattern1 {
    private static EagerSingletonPattern1 instance = new EagerSingletonPattern1();
    private EagerSingletonPattern1() {
    }
    public static EagerSingletonPattern1 getInstance() {
        return instance;
    }
}
