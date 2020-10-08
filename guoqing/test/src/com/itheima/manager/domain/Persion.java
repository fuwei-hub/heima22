package com.itheima.manager.domain;

public class Persion {
    private String xuehao;
    private String name;
    private int age;
    private String birthday;

    public Persion() {
    }

    public Persion(String xuehao, String name, int age, String birthday) {
        this.xuehao = xuehao;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "xuehao='" + xuehao + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
