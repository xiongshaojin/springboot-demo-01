package com.example.springbootdemo.dao;


import com.example.springbootdemo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Hai
 */
@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
