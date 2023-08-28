package org.itstack.structureModel.commandPattern.cuisine.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;
import org.itstack.structureModel.commandPattern.cuisine.ICuisine;

public class JiangSuCuisine implements ICuisine {
    private ICook cook;

    public JiangSuCuisine(ICook cook){
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
