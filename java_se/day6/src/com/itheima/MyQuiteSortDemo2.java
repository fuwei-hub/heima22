package com.itheima;
//快排
public class MyQuiteSortDemo2 {
    public static void main(String[] args) {
        int[]arr={6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        getQuite(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void getQuite(int[] arr, int min, int max) {
        if(min>max){
            return;
        }
        int stare=min;
        int end=max;
        int basenumber=arr[stare];
        while(min!=max){
            while (arr[max]>=basenumber&&max>min) {
                max--;
            }
            while (arr[min]<=basenumber&&max>min){
                min++;
            }
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
            }
        int temp=arr[min];
        arr[min]=arr[stare];
        arr[stare]=temp;
        getQuite(arr,stare,min-1);
        getQuite(arr,min+1,end);

        }
    }
