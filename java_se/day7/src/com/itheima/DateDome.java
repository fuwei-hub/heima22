package com.itheima;

import java.util.Date;

public class DateDome {
    public static void main(String[] args) {
        //创建Date对象，无参构造展示出当前时间
        Date date = new Date();
        System.out.println(date);
        //创建Date有参构造，展示出1970年1有日8日+100000毫秒的时间
        Date date1 = new Date(100000L);
        System.out.println(date1);

        //Date.getTime方法获取的是日期对象从1970年1月1日 08:00:00到现在的毫秒值
        long time = date.getTime();
        System.out.println(time);
        //setTime方法获取的是long类型的l毫秒所对应的时间
        long l = System.currentTimeMillis();
        date.setTime(l);
        System.out.println(date);




    }
}
