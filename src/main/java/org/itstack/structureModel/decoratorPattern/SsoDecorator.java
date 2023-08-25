package org.itstack.structureModel.decoratorPattern;

public abstract class SsoDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator(){}

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        System.out.println("SsoDecoratorCheck");
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
