package cn.itcast.Dao;

import cn.itcast.domain.Login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LoginDao {

    @Select("select * from login where username=#{username} and password=#{password}")
    Login findByUsernameAndPassword(@Param("username") String username,@Param("password") String password)throws Exception;
}
