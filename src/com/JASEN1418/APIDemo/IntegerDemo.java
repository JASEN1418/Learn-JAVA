package com.JASEN1418.APIDemo;

import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        String s1=Integer.toBinaryString(100);
        System.out.println(s1);

        String s2=Integer.toHexString(100);
        System.out.println(s2);

        String s3=Integer.toOctalString(100);
        System.out.println(s3);

        int a=Integer.parseInt(s1);
        System.out.println(a+10);

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int tar=Integer.parseInt(s);
        System.out.println(tar);
        String doublestring=sc.nextLine();
        double d=Double.parseDouble(doublestring);
        System.out.println(d);
    }
}
