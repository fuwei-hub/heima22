package cn.itcast.dao;

import cn.itcast.domain.Login;
import cn.itcast.domain.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginDao {

    Login findByUsernameAndPassword(@Param("username") String username, @Param("password")String password)throws Exception;

    List<Person>findAll()throws Exception;

    Integer delete(Integer id)throws Exception;

    Integer addStudent(Person person)throws Exception;

    Person findById(Integer id)throws Exception;

    Integer update(Person person)throws Exception;
}
