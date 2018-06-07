package com.kodilla.good.patterns.challenges.product_order_service;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderDetailsRetriever orderDetailsRetriever = new OrderDetailsRetriever();
        OrderDetails orderDetails = new OrderDetailsRetriever().retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderCreator(), new OrderRetriever());
        orderProcessor.process(orderDetails);
    }
}
