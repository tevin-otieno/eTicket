package models;

public class Event {

    private String title;
    private String location;
    private String time;
    private int price;
    private String host;

    public Event(String title, String location, String time, int price, String host) {
        this.title = title;
        this.location = location;
        this.time = time;
        this.price = price;
        this.host = host;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public String getHost() {
        return host;
    }
}
