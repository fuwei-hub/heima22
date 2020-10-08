package com.itheima;

import java.util.Scanner;

//键盘录入学生的姓名和年龄,其中年龄为18 - 25岁,
// 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        s.setName(name);
        while (true) {
            System.out.println("请输入年龄");
            String age = sc.nextLine();
            try {
                int a = Integer.parseInt(age);
                s.setAge(a);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("请输入整数哦");
                continue;
            }catch (RuntimeException e){
                e.printStackTrace();
                System.out.println("请输入合理的年龄");
                continue;
            }
            System.out.println("添加成功");
            break;
        }
    }
}
