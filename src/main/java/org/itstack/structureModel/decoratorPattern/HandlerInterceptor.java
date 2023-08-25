package org.itstack.structureModel.decoratorPattern;

public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
