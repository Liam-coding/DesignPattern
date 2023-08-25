package org.itstack.structureModel.decoratorPattern.coffee;

public class MilkDecorator implements CoffeeDecorator {
    private final Coffee decoratedCoffee;

    public MilkDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.0;
    }
}
