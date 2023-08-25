package org.itstack.structureModel.decoratorPattern.coffee;

public class SugarDecorator implements CoffeeDecorator {
    private final Coffee decoratedCoffee;

    public SugarDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
