package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Shop{
    @Override
    public boolean process(ProductOrder productOrder) {
        System.out.println("Welcome to GlutenFreeShop! Only Gluten Free certified products for you!");
        return true;
    }
}
