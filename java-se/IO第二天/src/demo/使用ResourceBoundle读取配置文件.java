package demo;

import domain.Person;

import java.util.ResourceBundle;

public class 使用ResourceBoundle读取配置文件 {
    public static void main(String[] args) {
        ResourceBundle person = ResourceBundle.getBundle("Person");
        System.out.println(person.getString("xuehao"));
        System.out.println(person.getString("name"));
        System.out.println(person.getString("age"));

    }
}
