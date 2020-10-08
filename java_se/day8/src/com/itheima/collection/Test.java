package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("小美", 20);
        Student student2 = new Student("小花", 18);
        Student student3 = new Student("小强", 33);
        list.add(student);
        list.add(student2);
        list.add(student3);

            for (Student student1 : list) {
                //这种情况下，只有student1的setName方法可以改变里面的值
                //循环内不能对数据进行删除，for里面创建对象所调用的方法不会影响外部的数据
                student1.setName("didi");
                Student student4 = new Student();
                student4.setName("didi2");

            }
        System.out.println(list);
    }
}
