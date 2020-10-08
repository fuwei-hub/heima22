package com.itheima.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparable2 {
    public static void main(String[] args) {
        TreeSet<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            //匿名内部类
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge();
            }
        });

        //lambda表达式
        TreeSet<Teacher> xteachers = new TreeSet<>((o1, o2) ->
                o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge()
        );

        Teacher zhang = new Teacher("张三", 23);
        Teacher zhao = new Teacher("赵四", 21);
        Teacher wang = new Teacher("王五", 28);
        Teacher li = new Teacher("张三", 23);
        Teacher fu = new Teacher("付帅", 28);
        xteachers.add(zhang);
        xteachers.add(zhao);
        xteachers.add(wang);
        xteachers.add(li);
        xteachers.add(fu);
        for (Teacher xteacher : xteachers) {
            System.out.println(xteacher);
        }
    }
}


class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}