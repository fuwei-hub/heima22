package com.itheima.manager.dao;

import com.itheima.manager.domain.Student;

import java.util.ArrayList;

public class ImpDao implements IntDao {
    private static ArrayList<Student> list = new ArrayList<>();
    static {
        Student zhang = new Student("0001", "张三", 28, "1997-01-01");
        Student zhao = new Student("0002", "赵四", 32, "1990-01-01");
        Student wang = new Student("0003", "王五", 44, "1980-01-01");
        list.add(zhang);
        list.add(zhao);
        list.add(wang);
    }
    @Override
    public void addStudent(Student student) {
        list.add(student);
}

    @Override
    public void deletStudent(String xuehao) {
        int index = getIndex(xuehao, list);
        list.remove(index);
    }

    @Override
    public void updateStudent(String xuehao, Student student) {
        int index = getIndex(xuehao, list);
        list.set(index,student);
    }

    @Override
    public ArrayList<Student> findAllStudent() {
        return list;
    }

    @Override
    public int getIndex(String xuehao, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            if(stu!=null&&stu.getXuehao().equals(xuehao)){
                return i;
            }
        }
        return -1;
    }
}
