package org.itstack.structureModel.commandPattern.cook.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;

public class ShanDongCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("ShanDongCook do cooking...");
    }
}
