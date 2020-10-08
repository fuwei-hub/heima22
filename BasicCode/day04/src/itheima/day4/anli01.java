package itheima.day4;
//求最值
//1.先将数字展示出来
//2.设sum变量等于0
//3.挨个比较
//4.输出
public class anli01 {
    public static void main(String[] args) {
        int []aar=new int[] {59,89,98,58,45};
        int max=aar[0];
        for (int i = 0; i < aar.length; i++) {
            max= max >aar[i] ? max : aar[i];
        }
        System.out.println("最大的数是："+max);
    }
}
