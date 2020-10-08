package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection集合的遍历
public class Demo02 {
    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();
        Student student = new Student("小美", 20);
        Student student2 = new Student("小花", 18);
        Student student3 = new Student("小强", 33);
        list.add(student);
        list.add(student2);
        list.add(student3);

        Iterator<Student> iterator = list.iterator();
        //boolean hasNext(): 判断当前位置是否有元素可以被取出
        //E next(): 获取当前位置的元素,将迭代器对象移向下一个索引位置
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if ("小强".equals(next.getName())) {
                iterator.remove();
            }
        }
        System.out.println(list);
        System.out.println("-----------------------------");

        //增强for循环
        for (Student student1 : list) {
            System.out.println(list);
        }

    }
}
