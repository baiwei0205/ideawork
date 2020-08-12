package com.mdd.service;

import com.mdd.entity.User;
import com.mdd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User getUser(int id){
        return userMapper.getUser(id);
    }

}
