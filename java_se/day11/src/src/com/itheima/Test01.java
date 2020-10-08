package src.com.itheima;

//可变参数练习
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = getSum(arr);
        System.out.println(a);
    }

    private static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
