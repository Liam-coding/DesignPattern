package org.itstack.behavioralPattern.commandPattern.cuisine.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;
import org.itstack.behavioralPattern.commandPattern.cuisine.ICuisine;

public class SiChuanCuisine implements ICuisine {
    private ICook cook;
    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }
    public void cook() {
        cook.doCooking();
    }
}
