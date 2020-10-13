package Test;

import domain.Manager;
import domain.Subway;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("======欢迎来到地铁信息管理系统======");
            System.out.println("1.管理人员登录  2.退出");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1:
                    //System.out.println("管理人员登录");
                    denglu();
                    break;
                case 2:
                    System.out.println("欢迎您的下次使用,再见");
                    System.exit(0);
                default:
                    System.out.println("请输入正确的业务编号");
                    break;
            }
        }
    }

    private static void denglu() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("kaoshi\\src\\Test\\managers.txt"));
        ArrayList<Manager> managers = new ArrayList<>();
        String leng;
        while ((leng = br.readLine()) != null) {
            String[] split = leng.split(",");
            Manager manager = new Manager(split[0], split[1], split[2], split[3]);
            managers.add(manager);
        }
        while (true) {
            System.out.println("请输入工号");
            String s = new Scanner(System.in).nextLine();
            if (managers.get(0).getGonghao().equals(s) || managers.get(1).getGonghao().equals(s) || managers.get(2).getGonghao().equals(s)) {
                System.out.println("请输入姓名");
                String s1 = new Scanner(System.in).nextLine();
                if (managers.get(0).getName().equals(s1) || managers.get(1).getName().equals(s1) || managers.get(2).getName().equals(s1)) {
                    System.out.println("登录成功");
                    ManagerChoose managerChoose = new ManagerChoose();
                    managerChoose.xuanxiang();
                    break;
                } else {
                    System.out.println("姓名有误");
                }
            } else {
                System.out.println("工号有误");
            }
        }
    }
}













