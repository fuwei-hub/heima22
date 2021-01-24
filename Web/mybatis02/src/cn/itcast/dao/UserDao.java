package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface UserDao {
    List<User>findAll()throws Exception;

    User findById(Integer uid)throws Exception;

    int update(User user)throws Exception;

    List<User>findByCondition(User user)throws Exception;
}
