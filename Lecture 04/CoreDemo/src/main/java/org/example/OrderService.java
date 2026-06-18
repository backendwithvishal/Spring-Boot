package org.example;

import org.example.notification.EmailService;

public class OrderService {

    EmailService notification = new EmailService();

    public void placOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
