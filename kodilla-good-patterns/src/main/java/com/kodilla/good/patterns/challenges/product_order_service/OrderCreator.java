package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderCreator implements OrderService {
    @Override
    public boolean createOrder(final User user, final Item item, final double itemQuantity) {
        System.out.println("Creating new order for user: " + user.getFullUserName() + "\nItem: " + item.getItemName() + "; quantity: " + itemQuantity);
        return true;
    }
}
