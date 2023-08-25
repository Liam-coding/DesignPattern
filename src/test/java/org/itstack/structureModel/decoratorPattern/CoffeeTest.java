package org.itstack.structureModel.decoratorPattern;

import org.itstack.structureModel.decoratorPattern.coffee.Coffee;
import org.itstack.structureModel.decoratorPattern.coffee.MilkDecorator;
import org.itstack.structureModel.decoratorPattern.coffee.SimpleCoffee;
import org.itstack.structureModel.decoratorPattern.coffee.SugarDecorator;
import org.junit.jupiter.api.Test;

public class CoffeeTest {
    @Test
    public void coffeeTest(){
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);

        System.out.println("Description: " + sweetMilkCoffee.getDescription());
        System.out.println("Cost: " + sweetMilkCoffee.cost());
    }
}
