package com.itheima.lianxi;
//将一个静态初始化的数组里面的元素前后颠倒。例如：{16，65，45，85，95}
//       颠倒为{95，85，45，65，16}

public class LianXi01 {
    public static void main(String[] args) {
        int[] arr = {16, 65, 45, 85, 95};
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            //arr[start];arr[end]
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            //这里就将数组中的数据颠倒好了
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
