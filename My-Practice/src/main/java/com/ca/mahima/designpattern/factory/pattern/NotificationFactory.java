package com.ca.mahima.designpattern.factory.pattern;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equals("SMS"))
            return new SMSNotification();
        if (type.equals("EMAIL"))
            return new EmailNotification();
        return null;
    }
}
