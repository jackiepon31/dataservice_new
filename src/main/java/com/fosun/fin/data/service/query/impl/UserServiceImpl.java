package com.fosun.fin.data.service.query.impl;

import com.fosun.fin.data.entity_bak.User;
import com.fosun.fin.data.service.query.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by root on 17-5-22.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int add(User user) throws IOException {
        return userDao.addUser(user);
    }

    @Override
    public User getUserByName(String name) throws IOException {
        return userDao.getUserByName(name);
    }
}
