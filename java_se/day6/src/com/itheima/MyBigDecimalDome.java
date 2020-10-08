package com.itheima;
/*
BigDecimal(double val)    参数为double
BigDecimal(String val)    参数为String

public BigDecimal add(另一个BigDecimal对象)      加法
public BigDecimal subtract (另一个BigDecimal对象)减法
public BigDecimal multiply (另一个BigDecimal对象)乘法
public BigDecimal divide (另一个BigDecimal对象)  除法
public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式)
*/

import java.math.BigDecimal;

public class MyBigDecimalDome {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(18.0);
        BigDecimal bigDecimal2 = new BigDecimal(9.0);
        //public BigDecimal add(另一个BigDecimal对象)   加法
        System.out.println(bigDecimal.add(bigDecimal2));

        //public BigDecimal subtract (另一个BigDecimal对象)减法
        System.out.println(bigDecimal.subtract(bigDecimal2));

        //public BigDecimal multiply (另一个BigDecimal对象)乘法
        System.out.println(bigDecimal.multiply(bigDecimal2));

        //public BigDecimal divide (另一个BigDecimal对象)  除法
        //System.out.println(bigDecimal.divide(bigDecimal2));

        BigDecimal bigDecima3 = new BigDecimal(10.0);
        BigDecimal bigDecimal4 = new BigDecimal(3.33);
        //public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式)
        //四舍五入
        System.out.println(bigDecima3.divide(bigDecimal4, 5, BigDecimal.ROUND_HALF_UP));
        //向下取余
        System.out.println(bigDecima3.divide(bigDecimal4, 5, BigDecimal.ROUND_FLOOR));
        //向上取余
        System.out.println(bigDecima3.divide(bigDecimal4, 6, BigDecimal.ROUND_UP));
    }
}
