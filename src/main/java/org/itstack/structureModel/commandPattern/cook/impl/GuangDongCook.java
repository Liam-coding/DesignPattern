package org.itstack.structureModel.commandPattern.cook.impl;

import org.itstack.structureModel.commandPattern.cook.ICook;

import java.sql.SQLOutput;

public class GuangDongCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("guangdong do cooking...");
    }
}
