package test.test02;

import java.io.Serializable;
import java.util.Objects;

public class Teacher implements Serializable {
    private String name;
    private Integer age;
    private String address;
    private Integer gender;

    public Teacher() {
    }

    public Teacher(String name, Integer age, String address, Integer gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) &&
                Objects.equals(age, teacher.age) &&
                Objects.equals(address, teacher.address) &&
                Objects.equals(gender, teacher.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, gender);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
