package com.kodilla.good.patterns.challenges.product_order_service;

public interface OrderRepository {
    void saveOrder(final User user, final Item item, final double itemQuantity);
}
