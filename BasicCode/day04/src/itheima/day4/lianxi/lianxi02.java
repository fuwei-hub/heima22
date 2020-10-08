package itheima.day4.lianxi;

import java.util.Scanner;

/*
6个评委打分打0-100的分数，去掉一个最高分，一个最低分，取平均分输出
1.设置一个长度为6的动态初始化数组
2.展开6个数组的元素
3.键盘录入，把键盘录入的数赋值给元素
4.判断最高值和最低值
5.定义变量记录和
6.输出和
 */
public class lianxi02 {
    public static void main(String[] args) {
        int[] aar = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < aar.length; i++) {
            System.out.println("请输入" + (i + 1) + "号评委的评分");
            int s = sc.nextInt();
            if (s > 100 | s < 0) {
                System.out.println("请输入正确的评分");
                i--;
            } else {
                aar[i] = s;
            }
        }
        int max = aar[0];
        int min = aar[0];
        int sum = aar[0];
        for (int i = 0; i < aar.length; i++) {
            if (max < aar[i]) {
                max = aar[i];
            }
            if (min > aar[i]) {
                min = aar[i];
            }
            sum += aar[i];
        }
        int avg = (sum - max - min) / 4;
        System.out.println("该选手的最终得分是：" + avg);

    }
}
