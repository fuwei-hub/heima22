package com.itheima.treeset;

import java.util.TreeSet;

public class Comparable1 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student zhang = new Student("张三", 23);
        Student zhao = new Student("赵四", 21);
        Student wang = new Student("王五", 28);
        Student li = new Student("张三", 23);
        Student fu = new Student("付帅", 28);
        students.add(zhang);
        students.add(zhao);
        students.add(wang);
        students.add(li);
        students.add(fu);
        System.out.println(students);


    }
}


class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        int i = this.getAge() - o.getAge();
        int i1 = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i1;
    }
}
