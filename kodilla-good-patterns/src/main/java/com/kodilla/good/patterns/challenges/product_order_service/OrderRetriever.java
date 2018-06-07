package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderRetriever implements OrderRepository{
    @Override
    public void saveOrder(final User user, final Item item, final double itemQuantity) {
        System.out.println("Saving new order data: \n" + user.getFullUserName() + "\n" + item.getItemName() + "\n" + "Quantity: " + itemQuantity);
    }
}
