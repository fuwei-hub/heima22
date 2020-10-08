package com.itheima.task;

import java.util.Scanner;

/*
输入星期数，显示今天的减肥活动
​          周一：跑步             1.重复进行需要循环，未知循环次数，用while
​          周二：游泳             2.键盘录入
​          周三：慢走
​          周四：动感单车
​          周五：拳击
​          周六：爬山
​          周日：好好吃一顿
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        lo:while(true){
            System.out.println("请输入您想要查询的日期");
            System.out.println("输入“0”则退出程序");
            int day=sc.nextInt();
            switch (day){
                case 0:
                    break lo;
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好吃一顿");
                    break;
                default:
                    System.out.println("请输入正确的日期");
                    break;
            }
        }
        System.out.println("感谢您的再次使用");
    }
}
