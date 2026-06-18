package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SmsService;

public class OrderService {

    NotificationService notification = new EmailService();

    public void placOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
