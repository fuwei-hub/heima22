package com.itheima.service;

import com.itheima.bean.User;

public interface UserService {
    User login(String username, String password)throws Exception;
}
