package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.dao.UserDao;
import com.example.mybatisdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * PaclageName com.example.mybatisdemo.controller
 *
 * @Created on  2020/5/19 0019
 * @Author xumingming
 * @DDesrciption
 */

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/boot")
public class BootController {

    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "getUser")
    public User getUser()
    {
        User user=new User();
        user.setUserName("test");
        return user;
    }

    @RequestMapping(value = "getAllUser")
    public List<User> getUsers()
    {
        List<User> userList= userDao.selectUser();
        return userList;
    }
}
