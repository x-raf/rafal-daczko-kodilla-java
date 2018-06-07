package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderProcessor {
    private NotificationService notificationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final NotificationService notificationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderDetails orderDetails) {
        boolean isOrdered = orderService.createOrder(orderDetails.getUser(),orderDetails.getItem(), orderDetails.getItemQuantity());
        if(isOrdered) {
            notificationService.sendConfirmation(orderDetails.getUser());
            orderRepository.saveOrder(orderDetails.getUser(),orderDetails.getItem(), orderDetails.getItemQuantity());
            return new OrderDto(orderDetails.getUser(),true);
        }else {
            return new OrderDto(orderDetails.getUser(),false);
        }
    }
}
