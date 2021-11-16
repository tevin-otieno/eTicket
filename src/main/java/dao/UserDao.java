package dao;

import models.User;

import java.util.List;

public interface UserDao {
    void add (User event);

    //read
    User findById(int id);

    //update
    void update(int id,String name, String phoneNumber, String ticket);

    //delete
    void deleteById(int id);
}
