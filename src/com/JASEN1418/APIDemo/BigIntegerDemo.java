package com.JASEN1418.APIDemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        Random ra=new Random();
        BigInteger a=new BigInteger(2,ra);//获取2的num次方减一的随机数
        System.out.println(a);
        BigInteger b=new BigInteger("12345678987654321");
        System.out.println(b);
        BigInteger c=new BigInteger("100",2);//获取指定进制的数
        System.out.println(c);

        BigInteger d=BigInteger.valueOf(16);//获取long以内的数-16~16已经创建好了不会重复创建
        System.out.println("-------------------");

        //加减乘除
        System.out.println(a.add(b));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.divide(a));
        System.out.println("-------------------");

        //商和余数
        BigInteger[] arr=b.divideAndRemainder(c);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("-------------------");

        //常用方法
        System.out.println(a.equals(b));
        System.out.println(a.max(b));
        System.out.println(a.min(b));
        System.out.println(b.pow(2));
        System.out.println("-------------------");

        //转换成int
        System.out.println(a.intValue());
    }
}
