package org.itstack.structureModel.decoratorPattern.sso;

public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
