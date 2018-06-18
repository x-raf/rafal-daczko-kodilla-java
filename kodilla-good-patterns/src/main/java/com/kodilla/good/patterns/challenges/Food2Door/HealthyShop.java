package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop {
    @Override
    public boolean process(ProductOrder productOrder){
        System.out.println("Welcome to Healthy Shop, where you can find lots of healthy products!");
        return true;
    }
}
