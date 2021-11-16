package models;

public class User {
    private String name;
    private String phoneNumber;
    private String ticket;
    private int id;

    public User(String name, String phoneNumber, String ticket) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getTicket() {
        return ticket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
