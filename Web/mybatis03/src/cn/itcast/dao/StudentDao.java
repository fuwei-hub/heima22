package cn.itcast.dao;

import cn.itcast.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentDao {

    //查询全部
    @Select("select * from student")
    List<Student> findAll()throws Exception;


    //单条件查询
    @Select("select * from student where id=#{id}")
    Student findById(Integer id)throws Exception;


    //多条件查询
    @Select("select * from student where name=#{name} or age=#{age}")
    List<Student> findByNameOrAge(@Param("name") String name,@Param("age") Integer age)throws Exception;
}
