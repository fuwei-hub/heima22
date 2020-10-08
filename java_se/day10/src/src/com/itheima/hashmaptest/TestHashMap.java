package src.com.itheima.hashmaptest;

import java.util.*;

/*
- 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
- 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        Student student1 = new Student("黄子韬",23);
        Student student2 = new Student("黄子韬",22);
        Student student3 = new Student("鹿  晗",28);
        Student student4 = new Student("吴亦凡",24);
        Student student5 = new Student("吴亦凡",24);
        map.put(student1,"新加坡");
        map.put(student2,"广西");
        map.put(student3,"桂林");
        map.put(student4,"柳州");
        map.put(student5,"北京");
        //第一种遍历方式(有三种写法,这里生成了Student的Set单列集合,所以这里还包含有Set遍历的三种办法)
        Set<Student> students = map.keySet();
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            String s = map.get(next);
            System.out.println(next+"的老家在"+s);
        }
       /* for (Student student : students) {
            String s = map.get(student);
            System.out.println(student+"的老家在"+s);
        }*/
        System.out.println("----------------");
        //第二种遍历方式
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"的老家在"+value);
        }
        System.out.println("----------------");
        //第三种方式
        map.forEach((s1,s2)-> System.out.println(s1+"的老家在"+s2));
    }
}


class Student {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}