package domain;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private int age;
    private String name;
    private static final long serialVersionUID = 19980424;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person persion = (Person) o;
        return age == persion.age &&
                Objects.equals(name, persion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Persion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
