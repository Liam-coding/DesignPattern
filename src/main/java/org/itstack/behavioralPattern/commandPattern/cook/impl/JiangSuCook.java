package org.itstack.behavioralPattern.commandPattern.cook.impl;

import org.itstack.behavioralPattern.commandPattern.cook.ICook;

public class JiangSuCook implements ICook {

    public void doCooking() {
        System.out.println("JiangSuCook do cooking...");
    }
}
