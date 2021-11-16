package models;

import org.sql2o.Connection;

public class Event {

    private String title;
    private String location;
    private String eventTime;
    private int price;
    private String host;
    private int id;

    public Event(String title, String location, String eventTime, int price, String host) {
        this.title = title;
        this.location = location;
        this.eventTime = eventTime;
        this.price = price;
        this.host = host;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getEventTime() {
        return eventTime;
    }

    public int getPrice() {
        return price;
    }

    public String getHost() {
        return host;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setId(int id) {
        this.id = id;
    }
}
