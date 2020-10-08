
package com.itheima.anli;



/*需求：创建一个存储学生对象的集合，存储3个学生对象，
        使用程序实现在控制台遍历该集合 学生的姓名和年龄来自于键盘录入
        1.键盘录入
        2.将键盘录入的信息封装给学生类
        3.返回学生类参与循环，将信息赋给集合
        4.遍历集合
        */

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class AnLI03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            getArray(list);
        }
        for (int i = 0; i < list.size(); i++) {
            //list.get(i);
            System.out.println(list.get(i));
        }
    }

    private static void getArray(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            list.add(student);
        }
    }

