package cn.itcast.dao;

import cn.itcast.domain.Student;

import java.util.List;

public interface StudentsDao {
    List<Student> findAll()throws Exception;
}
