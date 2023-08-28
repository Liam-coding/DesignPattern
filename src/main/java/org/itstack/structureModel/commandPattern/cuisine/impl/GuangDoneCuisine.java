package org.itstack.structureModel.commandPattern.cuisine.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;
import org.itstack.structureModel.commandPattern.cuisine.ICuisine;

public class GuangDoneCuisine implements ICuisine {
    private ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
