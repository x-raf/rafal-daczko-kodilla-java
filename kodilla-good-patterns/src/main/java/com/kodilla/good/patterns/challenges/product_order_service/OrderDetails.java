package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderDetails {
    private User user;
    private UserAdress userAdress;
    private Item item;
    private double itemQuantity;

    public OrderDetails(User user, UserAdress userAdress, Item item, double itemQuantity) {
        this.user = user;
        this.item = item;
        this.itemQuantity = itemQuantity;
    }

    public User getUser() {
        return user;
    }

    public UserAdress getUserAdress() {
        return userAdress;
    }

    public Item getItem() {
        return item;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }
}
