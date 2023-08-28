package org.itstack.structureModel.commandPattern.cuisine.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;
import org.itstack.structureModel.commandPattern.cuisine.ICuisine;

public class SiChuanCuisine implements ICuisine {
    private ICook cook;
    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }
    public void cook() {
        cook.doCooking();
    }
}
