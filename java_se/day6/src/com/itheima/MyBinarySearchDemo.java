package com.itheima;
//在数组{1,2,3,4,5,6,7,8,9,10}中,查找某个元素的位置
/*二分查找法
1.定义数组
2.调用getIdex
3.返回相应的索引值
 */
public class MyBinarySearchDemo {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int min=0;
        int max=arr.length-1;
        int num=10;
        int index=getIndex(arr,min,max,num);
        System.out.println(index);
    }

    private static int getIndex(int[] arr, int min, int max, int num) {
        while(min<=max){
            int average=(min+max)>>1;
            if(arr[average]>num){
                max=average-1;
            } else if (arr[average]<num) {
                min=average+1;
            }else{
                return average;
        }
        }
        return -1;
    }
}
