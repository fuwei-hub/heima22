package src.com.itheima.treesettest;

//新建TreeSet对象,将三个学生对象存入TreeSet集合中,要求按照总分排序,
// 当总分一样时,先后按照语文.数学.英语决出先后顺序
import java.util.TreeSet;

public class TestSetTree {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student xiaomei = new Student("小美", 80, 89, 89);
        Student xiaoqiang = new Student("小强", 79, 87, 69);
        Student xiaogang = new Student("小刚", 80, 89, 77);
        students.add(xiaomei);
        students.add(xiaoqiang);
        students.add(xiaogang);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
