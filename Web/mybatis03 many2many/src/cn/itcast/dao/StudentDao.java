package cn.itcast.dao;

import cn.itcast.domain.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.swing.*;
import java.util.List;

public interface StudentDao {

    @Select("select * from student")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),

            @Result(column = "id",
                    property = "courses",
                    javaType = List.class,
                    many = @Many(select = "cn.itcast.dao.CourseDao.findBySid")
            )
    })
    List<Student>findAll()throws Exception;
}
