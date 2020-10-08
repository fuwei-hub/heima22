package com.itheima.manager.service;

import com.itheima.manager.Factory.StudentFactory;
import com.itheima.manager.dao.ImpDao;
import com.itheima.manager.dao.IntDao;
import com.itheima.manager.domain.Student;

import java.util.ArrayList;

public class ImpService implements IntService {
    private IntDao impDao = StudentFactory.getDao();
    @Override
    public void addStudent(Student student) {
       impDao.addStudent(student);
    }

    @Override
    public void deletStudent(String id) {
        impDao.deletStudent(id);
    }

    @Override
    public void updateStudent(String id, Student student) {
        impDao.updateStudent(id,student);
    }

    @Override
    public ArrayList<Student> findAllStudent() {
        ArrayList<Student> allStudent = impDao.findAllStudent();
        return allStudent;
    }

    @Override
    public boolean isExits(String id) {
        ArrayList<Student> allStudent = impDao.findAllStudent();
        for (int i = 0; i < allStudent.size(); i++) {
            Student stu=allStudent.get(i);
            if(stu!=null&&stu.getXuehao().equals(id)){
                return true;
            }
        }
        return false;
    }
}
