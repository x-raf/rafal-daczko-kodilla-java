package com.kodilla.good.patterns.challenges.product_order_service;

public class MailService implements NotificationService{
    @Override
    public void sendConfirmation(User user) {
        System.out.println("Sending confirmation e-mail to user: " + user.getFullUserName() + " to address: " + user.getEmail());
    }
}
