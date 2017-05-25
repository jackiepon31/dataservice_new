package com.fosun.fin.data.service.query;

import com.fosun.fin.data.entity_bak.User;

import java.io.IOException;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IUserService {
    public int add(User user) throws IOException;
    public User getUserByName(String name) throws IOException;
}
