package com.ca.mahima.designpattern.factory.pattern;

public class NotificationService {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();
        factory.createNotification("EMAIL").notifyUser();
        factory.createNotification("SMS").notifyUser();
    }
}
