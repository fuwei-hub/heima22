package test;

import domain.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class 序列化集合练习 {
    public static void main(String[] args) throws Exception {
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO02\\集合.txt"));
        ArrayList<Person> people = new ArrayList<>();
        Person xiaohong = new Person(28, "xiaohong");
        Person xiaowang = new Person(30, "xiaowang");
        Person liangliang = new Person(22, "liangliang");
        people.add(xiaohong);
        people.add(xiaowang);
        people.add(liangliang);
        oos.writeObject(people);
        oos.close();
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO02\\集合.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>) o;
        for (Person person : list) {
            System.out.println(person.getAge() + "," + person.getName());
        }
        ois.close();
    }
}
