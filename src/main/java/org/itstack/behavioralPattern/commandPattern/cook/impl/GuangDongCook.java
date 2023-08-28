package org.itstack.behavioralPattern.commandPattern.cook.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;

public class GuangDongCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("guangdong do cooking...");
    }
}
