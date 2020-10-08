package com.itheima.task;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.swing.*;

/*
我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
​        百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？就是各个能买多少只。
 */
public class Task04 {
    public static void main(String[] args) {
        int count=0;
        for (int w= 0; w <=20; w++) {
            for (int m = 0; m <=33 ; m++) {
               int z=100-w-m;
                if(z%3==0 && 5*w+3*m+z/3==100) {
                    ++count;
                    System.out.println("第"+count+"种买法");
                    System.out.print("鸡翁能买：" + w+"  ");
                    System.out.print("鸡母能买：" + m+"  ");
                    System.out.println("鸡雏能买：" + z);

                }
            }

        }

    }
}
