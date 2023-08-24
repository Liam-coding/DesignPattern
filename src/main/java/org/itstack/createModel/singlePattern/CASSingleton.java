package org.itstack.createModel.singlePattern;

import java.util.concurrent.atomic.AtomicReference;
//thread safe.
public class CASSingleton {
    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<CASSingleton>();

    private static CASSingleton instance;

    private CASSingleton(){}

    public static final CASSingleton getInstance() {
        for (; ; ) {
            CASSingleton instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new CASSingleton());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(CASSingleton.getInstance());
        System.out.println(CASSingleton.getInstance());
    }
}
