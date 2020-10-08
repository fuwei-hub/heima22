package itheima.day4.lianxi;

import java.util.Random;

/*
创建一个长度为6的整数数组,请编写代码,
随机生成六个0(包含)-100(不包含)之间的整数存放到数组中,然后计算出数组中所有元素的和并打印。
1.创建长度为6的动态初始化数组
2.随机产生六个数，把值赋给数组中的元素
3.创建变量记录和
4.输出和
 */
public class lianxi01 {
    public static void main(String[] args) {
        int sum=0;
        int[]aar=new int[6];
        Random s=new Random();
        System.out.println("随机产生的六个数为");
        for (int i = 0; i < aar.length; i++) {
            int a=s.nextInt(100);
            aar[i]=a;
            System.out.println(aar[i]);
            sum+=aar[i];
        }
        System.out.println("以上六个数的和为："+sum);
    }
}
