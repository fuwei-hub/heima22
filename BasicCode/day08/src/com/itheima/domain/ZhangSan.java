package com.itheima.domain;

public class ZhangSan {
    String name;
    String age;

    public ZhangSan() {
    }
    public ZhangSan(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "zhangsan{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
