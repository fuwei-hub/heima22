package com.itheima.fanxing;

import com.itheima.domain.Generic;

public class GenericDemo1 {
    public static void main(String[] args) {
        Generic<String,Integer> g1 = new Generic<String,Integer>();
        g1.setT("吴亦凡");
        g1.setK(38);
        System.out.println(g1.getT());
        System.out.println(g1.getK());

        Generic<Integer,Double> g2 = new Generic<Integer,Double>();
        g2.setT(18);
        g2.setK(11.2);
        System.out.println(g2.getT());
        System.out.println(g2.getK());
    }
}
