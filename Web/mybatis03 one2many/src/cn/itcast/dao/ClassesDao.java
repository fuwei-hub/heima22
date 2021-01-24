package cn.itcast.dao;

import cn.itcast.domain.Classes;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassesDao {

    @Select("select * from classes")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(
                    column = "id",
                    property = "students",
                    javaType = List.class,
                    many = @Many(select = "cn.itcast.dao.StudentDao.findByCid")
            )
    })
    List<Classes> findAll()throws Exception;
}
