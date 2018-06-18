package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process(ProductOrder productOrder){
        System.out.println("Welcome to Extra Food Shop! Some extraordinary items from allover the world!");
        return true;
    }
}
