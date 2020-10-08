package itheima.day4.lianxi;

/*
一张纸0.1，珠峰8844430，纸要折叠多少次才能和珠峰一样高。
1.定义paper和珠峰
1.定义变量记录次数
2.利用循环语句，因为未知循环次数，所以选择while。
 */
public class lianixi03 {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        int zf = 8844430;
        while (paper <= zf) {
            count++;
            paper *= 2;

        }
        System.out.println(count);
    }
}
