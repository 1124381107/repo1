package com.xxoo.demo.service;

import com.xxoo.demo.bean.User;
import com.xxoo.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
