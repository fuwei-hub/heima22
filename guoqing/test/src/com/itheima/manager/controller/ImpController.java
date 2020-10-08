package com.itheima.manager.controller;

import com.itheima.manager.Factory.StudentFactory;
import com.itheima.manager.domain.Student;
import com.itheima.manager.service.ImpService;
import com.itheima.manager.service.IntService;

import java.util.ArrayList;
import java.util.Scanner;

public class ImpController implements IntController {
    private Scanner sc = new Scanner(System.in);
    private IntService impService = StudentFactory.getService();
    @Override
    public void start() {
        System.out.println("----欢迎来到学生管理系统----");
        lo:
        while (true) {
            System.out.println("请输入您想要操作的业务编号");
            System.out.println("1.增加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    //System.out.println("增加学生");
                    addStudent();
                    break;
                case 2:
                    //System.out.println("删除学生");
                    deletStudent();
                    break;
                case 3:
                    //System.out.println("修改学生");
                    updateStudent();
                    break;
                case 4:
                    //System.out.println("查看学生");
                    findAllStudent();
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("请输入正确的业务编号");
                    break;
            }
        }

    }

    @Override//增加学生信息
    public void addStudent() {
        String xuehao;
        while (true) {
            System.out.println("请输入学号");
            xuehao = sc.next();
            boolean exits = impService.isExits(xuehao);
            if (exits) {
                System.out.println("该学号已存在,请重新输入");
            } else {
                break;
            }
        }
        Student student = getStudent(xuehao);
        impService.addStudent(student);
        System.out.println("添加成功");
    }

    private Student getStudent(String xuehao) {
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String birthday = sc.next();
        return new Student(xuehao, name, age, birthday);
    }

    @Override
    public void deletStudent() {
        String xuehao = isExits();
        if (tuichu(xuehao)) return;
        impService.deletStudent(xuehao);
        System.out.println("删除成功");
    }

    private boolean tuichu(String xuehao) {
        if("exit".equals(xuehao)){
            return true;
        }
        return false;
    }

    private String isExits() {
        String xuehao;
        lo:while (true) {
            System.out.println("请输入学号");
             xuehao= sc.next();
             if("exit".equals(xuehao)){
                 break lo;
             }
            boolean exits = impService.isExits(xuehao);
            if (!exits) {
                System.out.println("该学号不存在,请重新输入,输入exit返回学生管理页面");
            } else {
                break;
            }
        }
        return xuehao;
    }

    @Override
    public void updateStudent() {
        String exits = isExits();
        if (tuichu(exits)) return;
        Student student = getStudent(exits);
        impService.updateStudent(exits,student);
        System.out.println("修改成功");

    }

    @Override
    public void findAllStudent() {
        ArrayList<Student> allStudent = impService.findAllStudent();
        System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "生日");
        for (int i = 0; i < allStudent.size(); i++) {
            Student stu = allStudent.get(i);
            if (stu != null) {
                System.out.println(stu.getXuehao() + "\t" + stu.getName() + "\t" + stu.getAge() + "岁" + "\t" + stu.getBirthday());
            }
        }
    }
}
