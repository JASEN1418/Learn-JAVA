package com.JASEN1418.practice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        //十进制转二进制
        //增加一点难度，可以支持超大数
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        while(!check(s)){
            s=sc.nextLine();
        }
        BigInteger bigInteger=new BigInteger(s);
        bigInteger.subtract(BigInteger.valueOf(2));
        BigInteger[] arr=bigInteger.divideAndRemainder(BigInteger.valueOf(2));
        while(arr[0]!=BigInteger.valueOf(0)){
            arr=bigInteger.divideAndRemainder(BigInteger.valueOf(2));
            arrayList.add(arr[1].intValue());
            bigInteger=arr[0];
        }
        for (int i = arrayList.size()-1; i >= 0; i--) {
            System.out.print(arrayList.get(i));
        }
    }
    public static boolean check(String s){
        String regex="[1-9]\\d{0,9}";
        if(s.matches(regex))return true;
        System.out.println("错误数据");
        return false;
    }
}
