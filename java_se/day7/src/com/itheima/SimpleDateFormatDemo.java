package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat的有参构造方法，给定对象
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：SS");
       //SimplDateFormat的格式化方法
        System.out.println(simpleDateFormat.format(date));
        //SimplDateFormat的解析方法
        String s="2020年11月11日 00：00：00";
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);


    }
}
