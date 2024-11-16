package org.example.homework2;

public class Main {
    public static void main(String[] args) {
        Event event = new WindSpeed("2 Km/h");
        SenderNotification notification = new SenderNotification(new Phone(),new Tab(),new TV());
        notification.send(event);
    }
}
