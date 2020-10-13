package demo.demo06;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//学生入口
public class StudentEntry {
    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("1.添加学生   2.查询学生   3.退出");
            int i = new Scanner(System.in).nextInt();
            switch (i){
                case 1:
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case 2 :
                    //System.out.println("查询学生");
                    findAllStudent();
                    break;
                case 3:
                    System.out.println("感谢您的使用,再见!");
                    System.exit(0);
                default:
                    System.out.println("请输入正确的业务编号");
                    break;

            }
        }
    }
//查看本地数据
    private static void findAllStudent() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("D:\\学生信息.txt"));
        ArrayList<Student> strings = new ArrayList<>();
        String leng;
        while((leng=br.readLine())!=null){
            String[] split = leng.split(",");
            Student student = new Student(split[0], split[1], split[2]);
            strings.add(student);
        }
        for (Student string : strings) {
            System.out.println(string.findAll());
        }




    }
//添加数据到本地
    private static void addStudent() throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\学生信息.txt",true));
        System.out.println("请输入信息     例:张三23,山西");
        String[] split = new Scanner(System.in).nextLine().split(",");
        Student student = new Student(split[0], split[1], split[2]);
 /*       System.out.println("请输入姓名");
        String name = new Scanner(System.in).nextLine();
        System.out.println("请输入年龄");
        String age = new Scanner(System.in).nextLine();
        System.out.println("请输入住址");
        String dizhi = new Scanner(System.in).nextLine();
        Student student = new Student(name,age,dizhi);*/
        bw.write(student.findAll());
        bw.newLine();
        bw.close();
    }
}
