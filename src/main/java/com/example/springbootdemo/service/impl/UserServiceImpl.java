package com.example.springbootdemo.service.impl;


import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hai on 2018/1/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.insert(user) ;
    }

    @Override
    public User getUser(String id){
        return userDao.selectByPrimaryKey(Integer.valueOf(id));
    }

    @Override
    public boolean updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user) > 0;
    }

    @Override
    public boolean deleteByPrimaryKey(String id) {
        return userDao.deleteByPrimaryKey(Integer.valueOf(id)) > 0;
    }
}
