package com.JASEN1418.practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        //string变int
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        while(!check(s)){
            s=sc.nextLine();
        }
        long tar=0;
        for (int i = 0; i < s.length(); i++) {
            tar=tar*10+(s.charAt(i)-'0');
        }
        System.out.println(tar);
    }
    public static boolean check(String s){
        String regex="[1-9]\\d{0,9}";
        if(s.matches(regex))return true;
        System.out.println("错误数据");
        return false;
    }
}
