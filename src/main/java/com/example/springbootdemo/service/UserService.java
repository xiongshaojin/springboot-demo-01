package com.example.springbootdemo.service;



import com.example.springbootdemo.entity.User;

/**
 * Created by Hai on 2018/1/18.
 */

public interface UserService {
    void save(User user);
    User getUser(String id);
    boolean updateByPrimaryKey(User user);
    boolean deleteByPrimaryKey(String id);
}



