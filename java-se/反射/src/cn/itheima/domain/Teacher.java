package cn.itheima.domain;

import java.io.Serializable;
import java.util.Objects;

public class Teacher implements Serializable {
    private String name;
    private Integer age;
    private Integer money=30000;

    public Teacher() {
    }

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) &&
                Objects.equals(age, teacher.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void chifan(String s){
        System.out.println("中午吃的"+s);
    }

    private String shuijiao(){
        return "但是没睡饱";
    }

    public String drink(Integer integer){
        return "就喝了"+integer+"瓶红牛";
    }
}
