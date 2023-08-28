package org.itstack.behavioralPattern.commandPattern.cook.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;

public class SiChuanCook  implements ICook {
    @Override
    public void doCooking() {
        System.out.println("SiChuanCook do cooking...");
    }
}
