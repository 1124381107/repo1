package com.xxoo.demo.controller;


import com.xxoo.demo.bean.User;
import com.xxoo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

@RestController
@RequestMapping("user")
@MapperScan("com.xxoo.demo.mapper")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id")int id) {
        return userService.findById(id);
    }
}
