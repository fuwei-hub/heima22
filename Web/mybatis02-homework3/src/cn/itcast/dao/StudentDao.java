package cn.itcast.dao;

import cn.itcast.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll(Student student)throws Exception;

    List<Student> findAll2(Integer... integers)throws Exception;
}
