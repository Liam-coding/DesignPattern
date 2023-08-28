package org.itstack.structureModel.commandPattern;

import org.itstack.structureModel.commandPattern.cuisine.ICuisine;

import java.util.ArrayList;
import java.util.List;

public class XiaoEr {
    private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }
}
