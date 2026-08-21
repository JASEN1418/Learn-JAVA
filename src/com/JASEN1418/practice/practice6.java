package com.JASEN1418.practice;

import java.util.Arrays;

public class practice6 {
    public static void main(String[] args) {
        //爬楼梯
        //有n楼 每次只能爬1或2楼 问有几种爬法
        //经典的dp问题
        long[] dp=new long[1000];
        Arrays.fill(dp,0);
        dp[1]=1;dp[2]=2;
        for (int i = 3; i < 1000; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[10]);
    }
}
