package com.itheima.mapper;

import com.itheima.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * 根据帐号和密码查询用户信息
     * @return
     */
    @Select("select * from `user` where username=#{username} and password=#{password}")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
