package itheima.day4.Task;

import java.util.Random;
import java.util.Scanner;

/*
（随机小游戏）随机产生一个数，猜大小
1.随机产生0-100的数字
2.键盘录入
3.循环比大小。循环：for、while   while循环更适合未知循环次数的循环。
4.猜对，游戏结束。
 */
public class Task03 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(101);
        System.out.println("请输入您所选的数字！");
        int count = 5;
        lo:
        while (true) {
            int a = sc.nextInt();
            if (a > 100 | a < 0) {
                System.out.println("请输入0-100之间的数字！");
            } else {
                if (a == num) {
                    System.out.println("恭喜您答对了！");
                    break lo;
                }
                count--;
                if (count == 0) {
                    System.out.println("抱歉您没有机会了!");
                    System.out.println("答案为"+num);
                    break lo;
                } else {
                    if (a > num) {
                        System.out.println("猜高了！");
                        System.out.println("您还有" + count + "次机会");

                    } else {
                        System.out.println("猜低了！");
                        System.out.println("您还有" + count + "次机会");
                    }
                }
            }
        }
    }
}
