package itheima.day4;

import java.util.Scanner;

/*评委打分，六个评委打0-100的分数，去掉一个最大值，一个最小值，取和的平均数输出
1.动态初始化展开长度为6的数组
2.键盘录入赋值给元素
3.求最大值  最小值
4.求和除以四
 */
public class anli04 {
    public static void main(String[] args) {
        int[] aar = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < aar.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的评分");
            int scord = sc.nextInt();
            if (scord > 100 | scord < 0) {
                System.out.println("请输入正确的评分");
                i--;
            } else {
                aar[i] = scord;
            }
        }
        int max = aar[0];
        int min = aar[0];
        int sum = aar[0];
        for (int i = 1; i < aar.length; i++) {
            if (max < aar[i]) {
                max = aar[i];
            }
            if (min > aar[i]) {
                min = aar[i];
            }
            sum += aar[i];
        }
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        int avg = (sum - max - min) / 4;
        System.out.println("该选手的平均分数是" + avg);
    }
}
