package src.com.itheima;

//可变参数练习,可变参数为数组
public class Test01_2 {
    public static void main(String[] args) {
        int[]arr={11,22,33};
        int[]brr={44,55,66};
        int[]crr={77,88,99};
        getSum(arr,brr,crr);
    }

    private static void getSum(int[]...drr) {
        //第一次遍历为可变数组中的每个数组
        for (int i = 0; i < drr.length; i++) {
            int[]err=drr[i];
            /*System.out.println(drr[i]);*/
            //此时打印出来的是数组的地址值
            //获得可变参数中的数组,然后再进行遍历,可获得数组中的各个元素
            for (int i1 = 0; i1 < err.length; i1++) {
                System.out.println(err[i1]);
            }
        }
    }
}
