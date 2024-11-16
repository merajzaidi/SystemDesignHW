package org.example.homework2;

class WindSpeed implements Event{
    private String data;

    public WindSpeed(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
class Temperature implements Event{
    private String data;

    public Temperature(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}

class Humidity implements Event{
    private String data;

    public Humidity(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}
public class EventImpl {
}
