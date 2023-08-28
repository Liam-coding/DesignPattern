package org.itstack.behavioralPattern.visitorPattern;

import org.itstack.behavioralPattern.visitorPattern.visitor.impl.Parent;
import org.itstack.behavioralPattern.visitorPattern.visitor.impl.Principal;
import org.junit.jupiter.api.Test;

public class VisitorTest {
    @Test
    public void test(){
        DataView dataView = new DataView();
        System.out.println("parent view:");
        dataView.show(new Parent());

        System.out.println("principal view:");
        dataView.show(new Principal());
    }
}
