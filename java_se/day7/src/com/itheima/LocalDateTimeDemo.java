package com.itheima;

import java.time.*;
import java.time.format.DateTimeFormatter;

//
public class LocalDateTimeDemo {
    public static void main(String[] args) {


        System.out.println("--------"+"LocalDateTime的创建方法"+"--------");
        //public static LocalDateTime now()   获取当前的日期
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒)  指定日期
        LocalDateTime of = LocalDateTime.of(2020, 11, 25, 21, 07, 01);
        System.out.println(of);
        System.out.println("--------"+"LocalDateTime的获取方法"+"--------");
        //获得一年中的第几天
        System.out.println(of.getDayOfYear());
        //获得一个月中的第几天
        System.out.println(of.getDayOfMonth());
        //获得一星期中的第几天
        System.out.println(of.getDayOfWeek());
        //获得年
        System.out.println(of.getYear());
        //获得月份
        System.out.println(of.getMonthValue());
        //获得分钟数
        System.out.println(of.getMinute());
        //获得小时
        System.out.println(of.getHour());

        System.out.println("--------"+"LocalDateTime转换方法"+"--------");
        LocalDate localDate = of.toLocalDate();
        System.out.println(localDate);

        LocalTime localTime = of.toLocalTime();
        System.out.println(localTime);


        System.out.println("--------"+"LocalDateTime格式化和解析"+"--------");
        //LocalDateTime解析
        String s="2020年12月31日 11:11:11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(parse);

        //LocalDateTime的格式化
        LocalDateTime of1 = LocalDateTime.of(2020, 9, 25, 11, 34, 01);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(of1.format(dateTimeFormatter1));


        System.out.println("--------"+"LocalDateTime增加或者减少时间的方法 "+"--------");
        //增加年
        LocalDateTime of2 = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
        System.out.println(of2.plusYears(1));
        System.out.println(of2.plusYears(-2));
        //增加月   （因为是增加，所要没有范围限制，要是定义值的话就要在数值范围之内）
        System.out.println(of2.plusMonths(20));
        System.out.println(of2.plusMonths(-20));
        //增加周
        System.out.println(of2.plusWeeks(1));

        //减少年
        System.out.println(of2.minusYears(1));
        System.out.println(of2.minusYears(-1));
        //减少月
        System.out.println(of2.minusMonths(1));
        System.out.println(of2.minusMonths(-1));


        System.out.println("--------"+"LocalDateTime修改方法 "+"--------");
        LocalDateTime of3=LocalDateTime.of(2020,12,12,12,12,12);
        //修改年（这里是要定义一个数，所以一定取值一定要在范围内）
        System.out.println(of3.withYear(2019));
        //修改月
        System.out.println(of3.withMonth(2));
        //修改天
        System.out.println(of3.withDayOfMonth(2));

        System.out.println("--------"+"PeriodAndDuration "+"--------");
        LocalDate of4=LocalDate.of(2020,12,12);
        LocalDate of5=LocalDate.of(2010,6,10);
        //Period表示的是较长时间单位之间的时间差
        System.out.println(Period.between(of4, of5));

        //Duration表示的是较小时间单位之间的时间差
        LocalTime of6=LocalTime.of(00,00,00);
        LocalTime of7=LocalTime.of(20,12,12);
        System.out.println(Duration.between(of6, of7));


    }
}
