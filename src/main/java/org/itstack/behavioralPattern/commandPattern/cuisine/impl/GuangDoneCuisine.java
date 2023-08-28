package org.itstack.behavioralPattern.commandPattern.cuisine.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;
import org.itstack.behavioralPattern.commandPattern.cuisine.ICuisine;

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
