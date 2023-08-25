package org.itstack.structureModel.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Calculator {
    int add(int a, int b);
}

class RealCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoking method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After invoking method: " + method.getName());
        return result;
    }
}

public class DynamicProxyDemo {
    public static void main(String[] args) {
        RealCalculator realCalculator = new RealCalculator();
        Calculator proxy = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(), new Class[]{Calculator.class}, new LoggingHandler(realCalculator));

        int result = proxy.add(3, 5);
        System.out.println("Result: " + result);
    }
}

