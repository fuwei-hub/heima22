package com.itheima.task;

/*
请定义教师类（Teacher），属性包括姓名和工号。
定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。
 */
public class Teacher {
    String name;
    int number;

    public void teach(String name, int number) {
        System.out.println("工号为" + number + "的" + name + "老师正在讲课");

    }
}
