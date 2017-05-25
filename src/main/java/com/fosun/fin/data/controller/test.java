package com.fosun.fin.data.controller;

import com.fosun.fin.data.entity_bak.User;
import com.fosun.fin.data.service.query.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/8.
 */
@RestController
@RequestMapping("/test")
public class test {
    @Autowired
    private IUserService userService;
    @RequestMapping("/add")
    public String add(User user) throws IOException {
            return String.valueOf(userService.add(user));
        }

    @RequestMapping("/search")
    public String add(String name) throws IOException {
        System.out.println(userService.getUserByName(name).getId());
        System.out.println(userService.getUserByName(name).getAge());
        System.out.println(userService.getUserByName(name).getName());

        return String.valueOf(userService.getUserByName(name));
    }


}



