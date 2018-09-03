package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal pizzaCost = thePizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),pizzaCost);
    }
    @Test
    public void testPizzaOrderWithMushroomsHamJalapenoAndExtraCheesePlusExpressDeliveryGetCost() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new MushroomsDecorator(thePizzaOrder);
        thePizzaOrder = new JalapenoDecorator(thePizzaOrder);
        thePizzaOrder = new HamDecorator(thePizzaOrder);
        thePizzaOrder = new ExtraCheeseDecorator(thePizzaOrder);
        thePizzaOrder = new ExpressDeliveryDecorator(thePizzaOrder);
        System.out.println("Pizza costs " + thePizzaOrder.getCost());
        //When
        BigDecimal pizzaCost = thePizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(41),pizzaCost);
    }
    @Test
    public void testPizzaOrderWithMushroomsHamJalapenoAndExtraCheesePlusExpressDeliveryGetDescription() {
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new MushroomsDecorator(thePizzaOrder);
        thePizzaOrder = new JalapenoDecorator(thePizzaOrder);
        thePizzaOrder = new HamDecorator(thePizzaOrder);
        thePizzaOrder = new ExtraCheeseDecorator(thePizzaOrder);
        thePizzaOrder = new ExpressDeliveryDecorator(thePizzaOrder);
        System.out.println(thePizzaOrder.getDescription());
        //When
        String pizzaOrderDescription = thePizzaOrder.getDescription();
        //Then
        assertEquals("You ordered a pizza with tomato sauce and cheese + mushrooms + jalapeno + ham + extra cheese and express delivery",pizzaOrderDescription);
    }
}
