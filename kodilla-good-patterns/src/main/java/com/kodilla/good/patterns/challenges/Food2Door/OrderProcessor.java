package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    public void processOrder (Shop shop, ProductOrder productOrder){
        boolean ordered = shop.process(productOrder);
        if (ordered){
            System.out.println("You ordered: " + productOrder.getProduct() + " quantity " + productOrder.getQuantity());
            System.out.println("Your order have been created.Thank you!" + "\n");
        }else {
            System.out.println("Ops, something went wrong! Please contact us!");
        }
    }
}
