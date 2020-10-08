package com.itheima.anli;

import com.itheima.domain.Student;

import java.util.ArrayList;

/*
创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class AnLi02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("付伟",23);
        Student student1 = new Student("一一",24);
        Student student2= new Student("二二",25);
        list.add(student);
        list.add(student1);
        list.add(student2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
