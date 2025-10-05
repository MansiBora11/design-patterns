package com.example.factorypattern;

public class FatteryPatternDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("email");
        notification1.notifyUser();

        Notification notification2 = factory.createNotification("sms");
        notification2.notifyUser();

        Notification notification3 = factory.createNotification("push");
        notification3.notifyUser();
    }
}
