package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
秒杀开始时间是2020年11月11日 00:00:00,结束时间是2020年11月11日 00:10:00,用户小贾下单的
时间是2020年11月11日 00:03:47,用户小皮下单时间是2020年11月11日 00:10:11,判断用户有没有成功参与秒杀活动
 */
public class MiaoSha {
    public static void main(String[] args) throws ParseException {
        String start = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:10:00";
        String s1 = "2020年11月11日 00:03:47";
        String s2 = "2020年11月11日 00:10:11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss" );
        long st = simpleDateFormat.parse(start).getTime();
        long en = simpleDateFormat.parse(end).getTime();
        long jia = simpleDateFormat.parse(s1).getTime();
        long pi = simpleDateFormat.parse(s2).getTime();
        if (jia >= st && jia <= en) {
            System.out.println("小贾成功参加秒杀");
        } else {
            System.out.println("很遗憾，小贾没有成功参加秒杀");
        }
        if (pi >= st && pi <= en) {
            System.out.println("小皮成功参加秒杀");
        } else {
            System.out.println("很遗憾，小皮没有成功参加秒杀");
        }
    }
}

