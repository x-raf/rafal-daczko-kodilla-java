package com.kodilla.good.patterns.challenges.product_order_service;

public interface OrderService {
    boolean createOrder(final User user, final Item item, final double itemQuantity);
}
