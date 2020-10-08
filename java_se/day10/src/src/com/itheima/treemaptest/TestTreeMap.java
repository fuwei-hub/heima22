package src.com.itheima.treemaptest;

import java.util.TreeMap;

/*
- 创建一个TreeMap集合,键是学生对象(Student),值是籍贯(String),学生属性姓名和年龄,按照年龄进行排序并遍历
- 要求按照学生的年龄进行排序,如果年龄相同则按照姓名进行排序

 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>();
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("赵四", 23);
        Student s3 = new Student("李五", 25);
        Student s4 = new Student("😘六", 26);
        Student s5 = new Student("🐎七", 28);
        Student s6 = new Student("张三", 23);
        map.put(s1, "河  南");
        map.put(s2, "安  徽");
        map.put(s3, "湖  北");
        map.put(s4, "湖  南");
        map.put(s5, "河  南");
        map.put(s6, "布达拉");
        map.forEach((o1, o2) -> System.out.println(o1 + "的故乡在" + o2));

    }

}


class Student implements Comparable<Student> {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.getAge() == 0 ? this.name.compareTo(o.getName()) : this.age - o.getAge();
    }
}