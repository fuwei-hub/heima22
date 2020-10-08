package com.itheima.manager.dao;

import com.itheima.manager.domain.Student;

import java.util.ArrayList;

public interface IntDao {
    void addStudent(Student student);
    void deletStudent(String xuehao);
    void updateStudent(String xuehao,Student student);
    ArrayList<Student> findAllStudent();
    int getIndex(String xuehao,ArrayList<Student>list);
}
