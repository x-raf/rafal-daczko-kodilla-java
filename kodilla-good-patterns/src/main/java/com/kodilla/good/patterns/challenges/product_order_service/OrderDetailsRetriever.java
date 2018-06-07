package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderDetailsRetriever {

    public OrderDetails retrieve() {

        User user = new User("TeddyBear","Ted","Bundy","teddybear@gmail.com");
        UserAdress userAdress = new UserAdress("5th Avenue","123A","00958","New York");
        Item item = new Item("Samsung EVO 850","Fast SSD disc for your laptop!");
        OrderDetails orderDetails = new OrderDetails(user,userAdress,item,1);

        return orderDetails;
    }
}
