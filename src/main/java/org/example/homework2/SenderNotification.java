package org.example.homework2;

public class SenderNotification {

    Device[] devices;
    SenderNotification(Device ... devices){
        this.devices = devices;
    }

    public void send(Event event){
        for(Device device : devices){
            device.sendNotification(event);
        }
    }
}
