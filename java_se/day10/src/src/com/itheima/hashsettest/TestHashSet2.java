package src.com.itheima.hashsettest;

import java.util.HashSet;
import java.util.Objects;

public class TestHashSet2 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Student xiaomei = new Student("小美", 23);
        Student xiaoqiang = new Student("小美", 23);
        Student xiaosan = new Student("小三", 23);
        students.add(xiaomei);
        students.add(xiaoqiang);
        students.add(xiaosan);
        for (Student student : students) {
            System.out.println(student);
        }
        //第二种遍历方式
        students.forEach((s1) -> System.out.println(s1));
    }

}


class Student {
    String name;
    int age;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}