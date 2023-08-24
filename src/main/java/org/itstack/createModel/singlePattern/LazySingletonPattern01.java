package org.itstack.createModel.singlePattern;

//thread not safe
public class LazySingletonPattern01 {
    private static LazySingletonPattern01 instance;

    private LazySingletonPattern01() {
    }

    public static LazySingletonPattern01 getInstance() {
        if (null != instance) return instance;
        return new LazySingletonPattern01();
    }
}
