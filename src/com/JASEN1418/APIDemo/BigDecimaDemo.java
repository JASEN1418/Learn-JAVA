package com.JASEN1418.APIDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimaDemo {
    public static void main(String[] args) {
        BigDecimal a=new BigDecimal("0.01");
        BigDecimal b=new BigDecimal("0.09");
        BigDecimal c=BigDecimal.valueOf(10);//优化了0-10

        //加减乘除
        System.out.println(a.add(b));
        System.out.println(b.subtract(a));
        System.out.println(a.multiply(b));
        System.out.println(b.divide(a));
        System.out.println(b.divide(a,2, RoundingMode.HALF_UP));//保留两位小数 四舍五入

    }
}
