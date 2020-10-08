package itheima.day4.Task;

import java.util.Random;

public class Task01 {


    public static void main(String[] args) {
        int sum = 0;
        int[] aar = new int[6];
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(100) ;
            aar[i] = num;
            System.out.println(aar[i]);
            sum += aar[i];
        }
        System.out.println("以上六个数的和为："+sum);
    }

}
