package org.itstack.behavioralPattern.commandPattern.cuisine.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;
import org.itstack.behavioralPattern.commandPattern.cuisine.ICuisine;

public class ShanDongCuisine implements ICuisine {
    private ICook cook;
    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }
    public void cook() {
        cook.doCooking();
    }
}
