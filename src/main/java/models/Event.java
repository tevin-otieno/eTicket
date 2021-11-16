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

    public void save() {
        try (Connection con=DB.sql2o.open()){
            String sql="INSERT INTO events (title, location, eventtime, price, host) VALUES (:title,:location,:eventtime,:price,:host)";
            this.id=(int) con.createQuery(sql,true)
                    .addParameter("title",this.title)
                    .addParameter("location",this.location)
                    .addParameter("eventtime",this.eventTime)
                    .addParameter("price",this.price)
                    .addParameter("host",this.host)
                    .executeUpdate()
                    .getKey();
        }
    }
}
