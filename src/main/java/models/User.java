package models;

public class User {
    private String name;
    private String phoneNumber;
    private String ticket;

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
}
