package org.itstack.structureModel.commandPattern.cuisine.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;
import org.itstack.structureModel.commandPattern.cuisine.ICuisine;

public class ShanDongCuisine implements ICuisine {
    private ICook cook;
    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }
    public void cook() {
        cook.doCooking();
    }
}
