package com.kruehl.springsecurity.demo.service;

import com.kruehl.springsecurity.demo.entity.User;
import com.kruehl.springsecurity.demo.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
