package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity_bak.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by root on 17-5-22.
 */
@Mapper
public interface UserDao {
//    @Insert("insert into user(id,name,age) values(#{user.id},#{user.name},#{user.age})")
    int addUser(@Param("user") User user);

//    @Select("select * from user where name = #{name}")
    User getUserByName(String name);
}
