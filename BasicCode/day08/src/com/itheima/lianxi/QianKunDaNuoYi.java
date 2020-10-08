package com.itheima.lianxi;
/*
需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回
            调用该方法，并在控制台输出结果。
            例如，数组为int[] arr = {1,2,3};
            执行方法后的输出结果为：[1, 2, 3]
 */

public class QianKunDaNuoYi {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //调用方法
        String s= toStringBuilder(arr);
        System.out.println(s);
    }

    private static String toStringBuilder(int[] arr) {
        //将接受的数组保存到StringBuilder
        StringBuilder sb = new StringBuilder("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
