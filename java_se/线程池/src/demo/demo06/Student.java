package demo.demo06;

import java.io.Serializable;

public  class Student implements Serializable {
    private String name;
    private String age;
    private String dizhi;


    public Student() {
    }

    public Student(String name, String age, String dizhi) {
        this.name = name;
        this.age = age;
        this.dizhi = dizhi;
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

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dizhi='" + dizhi + '\'' +
                '}';
    }
    public  String findAll(){
        return getName()+","+getAge()+","+getDizhi();
    }
}
