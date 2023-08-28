package org.itstack.behavioralPattern.commandPattern.cook.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;

public class ShanDongCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("ShanDongCook do cooking...");
    }
}
