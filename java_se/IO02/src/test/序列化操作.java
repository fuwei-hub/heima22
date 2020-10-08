package test;

import domain.Person;

import java.io.*;

public class 序列化操作 {
    public static void main(String[] args) throws Exception {
/*        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO02\\liang.txt"));
        Person persion = new Person(88,"亮总");
        oos.writeObject(persion);
        oos.close();*/

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO02\\liang.txt"));
        Object o = ois.readObject();
        Person p = (Person) o;
        System.out.println(p.getAge()+","+p.getName());
        ois.close();
    }
}
