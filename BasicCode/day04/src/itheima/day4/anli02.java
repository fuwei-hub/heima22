package itheima.day4;
//键盘录入求和
/*
1.动态格式化展开
2.键盘录入
3.键盘录入传递给元素
4.设置变量记录求和
5.输出
 */

import java.util.Scanner;

public class anli02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] aar = new int[5];
        for (int i = 0; i < aar.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            int a = sc.nextInt();
            aar[i] = a;
            sum += aar[i];
        }
        System.out.println("以上五个数的和为：" + sum);
    }
}
