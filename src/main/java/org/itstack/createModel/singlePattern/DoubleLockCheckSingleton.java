package org.itstack.createModel.singlePattern;

public class DoubleLockCheckSingleton {
    private static DoubleLockCheckSingleton instance;

    private DoubleLockCheckSingleton(){}

    public static DoubleLockCheckSingleton getInstance(){
        if(instance!=null) return instance;
        synchronized (DoubleLockCheckSingleton.class){
            if (instance == null){
                instance = new DoubleLockCheckSingleton();
            }
        }
        return instance;
    }
}
