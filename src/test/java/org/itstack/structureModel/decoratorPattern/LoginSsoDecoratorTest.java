package org.itstack.structureModel.decoratorPattern;

import org.itstack.structureModel.decoratorPattern.sso.LoginSsoDecorator;
import org.itstack.structureModel.decoratorPattern.sso.SsoInterceptor;
import org.junit.jupiter.api.Test;

public class LoginSsoDecoratorTest {
    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("login check" + request + (success ? "ok" : "failed"));
    }
}
