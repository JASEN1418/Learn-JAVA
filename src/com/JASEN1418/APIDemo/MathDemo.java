package com.JASEN1418.APIDemo;

public class MathDemo {
    public static void main(String[] args) {

        //向上取整
        System.out.println("向上取整：ceil");
        System.out.println(Math.ceil(14.18));
        System.out.println(Math.ceil(14.81));
        System.out.println(Math.ceil(-14.18));
        System.out.println(Math.ceil(-14.81));
        System.out.println("---------------------");

        //向下取整
        System.out.println("向下取整：floor");
        System.out.println(Math.floor(14.18));
        System.out.println(Math.floor(14.81));
        System.out.println(Math.floor(-14.18));
        System.out.println(Math.floor(-14.81));
        System.out.println("---------------------");

        //四舍五入
        System.out.println("四舍五入：round");
        System.out.println(Math.round(14.18));
        System.out.println(Math.round(14.81));
        System.out.println(Math.round(-14.18));
        System.out.println(Math.round(-14.81));
        System.out.println("---------------------");

        //max,min
        System.out.println(Math.max(14,18));
        System.out.println(Math.min(14,18));

        //sqrt,cbrt
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(8));
        System.out.println(Math.cbrt(8));

        //pow
        System.out.println(Math.pow(2,2));
        System.out.println(Math.pow(2,-2));
        System.out.println(Math.pow(2,3));

        //random
        for (int i = 0; i < 100; i++) {
            System.out.print(Math.floor(Math.random()*100+1));
            System.out.print(" ");
        }
    }
}
