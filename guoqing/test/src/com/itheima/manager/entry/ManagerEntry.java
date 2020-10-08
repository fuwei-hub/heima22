package com.itheima.manager.entry;

import com.itheima.manager.Factory.StudentFactory;
import com.itheima.manager.controller.ImpController;
import com.itheima.manager.controller.IntController;

import java.util.Scanner;

//管理系统的入口
public class ManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到黑马信息管理平台--------");
            System.out.println("请输入您所要查询的业务编号");
            System.out.println("1.学生管理    2.教师管理    3.退出");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    //System.out.println("学生管理平台");
                    IntController interController = StudentFactory.getController();
                    interController.start();
                    break;
                case 2:
                    System.out.println("教师管理平台");
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
}
