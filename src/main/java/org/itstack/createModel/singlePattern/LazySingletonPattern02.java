package org.itstack.createModel.singlePattern;

//thread safe
public class LazySingletonPattern02 {
    private static LazySingletonPattern02 instance;

    private LazySingletonPattern02() {}

    public static synchronized LazySingletonPattern02 getInstance() {
        if (null != instance) return instance;
        return new LazySingletonPattern02();
    }
}
