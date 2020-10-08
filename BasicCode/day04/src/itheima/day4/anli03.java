package itheima.day4;

import java.util.Scanner;

//键盘录入一个数据，找出索引
/*1.静态初始化输入数组；
2.键盘输入相应数字
3.遍历比较
4.定义变量记录索引       因为数组是从0开始数的，所以索引变量要从-1开始，因为  i会++
5.正确的话输出索引    aar[0]=98;*/

public class anli03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aar = {98, 46, 59, 54, 65};
        int index = -1;
        System.out.println("请输入您想要查询的整数：");
        int num = sc.nextInt();

        for (int i = 0; i < aar.length; i++) {
            if (aar[i] == num) {
                index = i;
                break;
        }
        }
        if(index!=-1){
            System.out.println("该数字相对应的索引是：" + index);
        }
        else{System.out.println("没有该数");}

    }
}


