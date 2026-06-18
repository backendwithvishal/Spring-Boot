package org.example;

import org.example.notification.EmailService;
import org.example.notification.FakeEmailService;
import org.example.notification.NotificationService;

public class Main {

    public static void main(String[] args) {

        NotificationService notification = new EmailService();

//        OrderService order = new OrderService(notification);

        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placOrder();
    }
}

// A class should ask what it needs and not
// build everything itself

// IDC --> Inversion of Control