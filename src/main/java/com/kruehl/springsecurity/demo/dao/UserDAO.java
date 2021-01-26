package com.kruehl.springsecurity.demo.dao;

import com.kruehl.springsecurity.demo.entity.User;

public interface UserDAO {

    User findByUserName(String userName);

    void save(User user);
}
