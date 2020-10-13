package Test;

import domain.Subway;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerChoose {
    public static void

    xuanxiang() throws Exception {
        ll:
        while (true) {
            System.out.println("欢迎您!");
            System.out.println("1.查看地铁站   2.添加地铁站  3.返回主页面");
            int s = new Scanner(System.in).nextInt();
            switch (s) {
                case 1:
                    //System.out.println("查看地铁站");
                    find();
                    break;
                case 2:
                    //System.out.println("添加地铁站");
                    add();
                    break;
                case 3:
                    System.out.println("欢迎您下次光临");
                    break ll;
                default:
                    System.out.println("您输入有误,请重新输入");
                    break;
            }
        }
    }

    private static void add() throws IOException {
        lo:
        while (true) {
            System.out.println("请输入地铁编号");
            String s = new Scanner(System.in).nextLine();
            boolean b = isCunzai(s);
            if (b) {
                System.out.println("该编号已存在,请重新输入");
            } else {
                System.out.println("请输入地铁站");
                String s1 = new Scanner(System.in).nextLine();
                System.out.println("请输入所属路线");
                String s2 = new Scanner(System.in).nextLine();
                Subway subway = new Subway(s, s1, s2);
                ArrayList<Subway> subways = getSubways();
                subways.add(subway);
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("kaoshi\\src\\Test\\subways.txt"));
                for (Subway subway1 : subways) {
                    bufferedWriter.write(subway1.getBianhao() + "," + subway1.getName() + "," + subway1.getLuxian());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                break lo;
            }
        }
    }

    //判断编号是否存在
    private static boolean isCunzai(String s) throws IOException {
        ArrayList<Subway> subways = getSubways();
        for (int i = 0; i < subways.size(); i++) {
            if (subways.get(i).getBianhao().equals(s)) {
                return true;
            }
        }
        return false;
    }

    private static void find() throws Exception {
        ArrayList<Subway> subways = getSubways();
        if (subways == null) {
            System.out.println("暂无地铁信息");
        } else {
            for (Subway subway : subways) {
                System.out.println(subway.getBianhao() + "," + subway.getName() + "," + subway.getLuxian());
            }
        }
    }

    //获得地铁信息
    private static ArrayList<Subway> getSubways() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("kaoshi\\src\\Test\\subways.txt"));
        ArrayList<Subway> subways = new ArrayList<>();
        String leng;
        while ((leng = br.readLine()) != null) {
            String[] split = leng.split(",");
            Subway subway = new Subway(split[0], split[1], split[2]);
            subways.add(subway);
        }
        return subways;
    }
}

