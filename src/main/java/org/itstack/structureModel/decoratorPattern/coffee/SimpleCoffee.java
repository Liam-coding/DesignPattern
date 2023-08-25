package org.itstack.structureModel.decoratorPattern.coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
