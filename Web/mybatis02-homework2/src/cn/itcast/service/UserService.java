package cn.itcast.service;

import cn.itcast.domain.User;

public interface UserService {
    User login(String username,String password)throws Exception;
}
