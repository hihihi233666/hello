package com.test.mapper;

import com.test.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User  login(@Param("username") String username, @Param("password") String password);
    void addUser(User user);
    int reset( User user );
}
