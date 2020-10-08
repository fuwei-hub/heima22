package com.itheima.anli;

import com.itheima.domain.Student;

import java.util.ArrayList;

/*
需求：定义一个方法，方法接收一个集合对象（泛型为Student），
方法内部将年龄低于18的学生对象找出 并存入新集合对象，方法返回新集合。
 */
public class AnLi05 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("黄老师", 26);
        Student s2 = new Student("w老师", 18);
        Student s3 = new Student("h老师", 15);
        Student s4 = new Student("w老师", 16);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        ArrayList<Student>newlist=getstudent(list);
        for (int i = 0; i < newlist.size(); i++) {
            System.out.println(newlist.get(i));
        }
    }

    private static ArrayList<Student> getstudent(ArrayList<Student> list) {
      //建立一个新集合，然后判断年龄，将学生对象放到里面
        ArrayList<Student> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.getAge()<18){
                newlist.add(student);
            }
        }
        return newlist;
    }
}
