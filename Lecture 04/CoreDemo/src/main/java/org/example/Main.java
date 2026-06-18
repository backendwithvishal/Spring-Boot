package org.example;

import org.example.notification.EmailService;
import org.example.notification.FakeEmailService;
import org.example.notification.NotificationService;

public class Main {

    public static void main(String[] args) {

        NotificationService notification = new FakeEmailService();

//        OrderService order = new OrderService(notification);

        OrderService order = new OrderService();

        order.placOrder();
    }
}

// A class should ask what it needs and not
// build everything itself