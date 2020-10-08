package com.itheima.manager.service;

import com.itheima.manager.domain.Student;

import java.util.ArrayList;

public interface IntService {
    void addStudent(Student student);
    void deletStudent(String id);
    void updateStudent(String id,Student student);
    ArrayList<Student> findAllStudent();
    boolean isExits(String id);
}
