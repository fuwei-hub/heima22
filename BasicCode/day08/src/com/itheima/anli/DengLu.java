package com.itheima.anli;

import java.util.Scanner;

//.equals()这个是比较方法，用来对比输入的数据和定义的数据是否一致
//用户登录，只有三次机会
public class DengLu {
    public static void main(String[] args) {
        //先定义两个对比的数据
        String name = "fuwei";
        String keyword = "112277";
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //三次机会，要使用for循环
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入宁的账号和密码");
            String scnemae = sc.nextLine();
            String scyword = sc.nextLine();
            if (name.equals(scnemae) && keyword.equals(scyword)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i == 3) {
                    System.out.println("抱歉，您今天的填写次数已达上限，请明日前来登录");
                } else {
                    System.out.println("错误，您还有" + (3 - i) + "次机会");
                }
            }
        }
    }
}

