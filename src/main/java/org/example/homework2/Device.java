package org.example.homework2;

class Phone implements Device{
    @Override
    public void sendNotification(Event event) {
        System.out.println("Recieved on Phone => " + event.getData());
    }
}
class TV implements Device{
    @Override
    public void sendNotification(Event event) {
        System.out.println("Recieved on TV=> " + event.getData());
    }
}

class Tab implements Device {
    @Override
    public void sendNotification(Event event) {
        System.out.println("Recieved on Tab=> " + event.getData());
    }
}
public interface Device {
    void sendNotification(Event event);
}
