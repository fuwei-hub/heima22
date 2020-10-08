package com.itheima.fanxing;

import java.util.ArrayList;

//public <T> void show(T t)
//定义一个泛型方法,将两个学生对象传入学生集合
// public <T> void show(T t) {
//        System.out.println(t);
//    }
public class AnLi {
    public static void main(String[] args) {

        ArrayList<Student> list = getList(new ArrayList<>(), new Student("付伟", 22), new Student("吴娱", 21));
        System.out.println(list);
    }

    public static<T> ArrayList<T> getList(ArrayList<T> students, T s1, T s2) {
        students.add(s1);
        students.add(s2);
        return students;
    }
}


class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}