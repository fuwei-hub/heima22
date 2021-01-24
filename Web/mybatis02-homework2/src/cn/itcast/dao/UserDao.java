package cn.itcast.dao;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password)throws Exception;
}
