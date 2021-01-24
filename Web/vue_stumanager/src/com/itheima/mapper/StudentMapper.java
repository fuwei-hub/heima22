package com.itheima.mapper;

import com.itheima.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    /**
     * 查询所有学生
     * @return
     */
    @Select("select * from student")
    public List<Student> findAll();

    /**
        添加数据方法
     */
    @Insert("INSERT INTO student VALUES (#{number},#{name},#{birthday},#{address})")
    void addStu(Student stu);

    /**
        修改数据方法
     */
    @Update("UPDATE student SET number=#{number},name=#{name},birthday=#{birthday},address=#{address} WHERE number=#{number}")
    void updateStu(Student stu);

    /**
        删除数据方法
     */
    @Delete("DELETE FROM student WHERE number=#{number}")
    void deleteStu(String number);
}
