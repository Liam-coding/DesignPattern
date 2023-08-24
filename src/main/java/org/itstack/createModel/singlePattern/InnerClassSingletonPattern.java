package org.itstack.createModel.singlePattern;

//very recommend
//Because of the JVM make sures the correctness of multiple threads.
/**
 1.When the application's first call to the getInstance() method occurs, it triggers the loading of the SingletonHolder class. However, instantiation does not occur immediately.
 2.The SingletonHolder class creates a static instance variable named instance within the static inner class, and this variable is initialized when the class is loaded.
 3.Since class loading is managed by the Java Virtual Machine in a thread-safe manner, the initialization of the instance variable is also guaranteed to be thread-safe.
 4.Once the instance variable is initialized, subsequent calls to the getInstance() method directly return the pre-initialized instance.
 * */
public class InnerClassSingletonPattern {
    private static class SingletonHolder {
        private static InnerClassSingletonPattern instance = new InnerClassSingletonPattern();
    }
    private InnerClassSingletonPattern(){}

    public static InnerClassSingletonPattern getInstance(){
        return SingletonHolder.instance;
    }
}
