package org.itstack.structureModel.decoratorPattern;

public class SsoInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        System.out.println("running SsoInterceptor.....");
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }
}