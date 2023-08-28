package org.itstack.structureModel.commandPattern.cook.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;

public class SiChuanCook  implements ICook {
    @Override
    public void doCooking() {
        System.out.println("SiChuanCook do cooking...");
    }
}
