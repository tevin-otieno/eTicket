package models;

import org.sql2o.Connection;

public class Event {

    private String title;
    private String location;
    private String time;
    private int price;
    private String host;
    private int id;

    public Event(String title, String location, String time, int price, String host) {
        this.title = title;
        this.location = location;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public String getHost() {
        return host;
    }

    public void save() {
        Connection con=DB.sql2o.open();
            String sql="INSERT INTO event (title, location, time, price, host) VALUES (:name,:location,:time,:price,:host)";
            this.id=(int) ((Connection) con).createQuery(sql,true)
                    .addParameter("title",this.title)
                    .addParameter("location",this.location)
                    .addParameter("time",this.location)
                    .addParameter("price",this.price)
                    .addParameter("host",this.host)
                    .executeUpdate()
                    .getKey();

    }
}
