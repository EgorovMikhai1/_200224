package org.example.unit.mockito.taski2;

public class SimpleNotificationService implements NotificationService {

    @Override
    public void sendPaymentNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}