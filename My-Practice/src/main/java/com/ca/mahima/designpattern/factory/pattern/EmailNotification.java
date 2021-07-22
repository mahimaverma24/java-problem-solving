package com.ca.mahima.designpattern.factory.pattern;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}
