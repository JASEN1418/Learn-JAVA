package com.JASEN1418.practice;

import java.util.ArrayList;

public class practice1 {
    public static void main(String[] args) {
        //从1开始获取数据 sum超过200停止
        ArrayList<Integer> arrayList=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
            arrayList.add(i);
            if(sum>200)break;
        }
        System.out.println(arrayList);
        System.out.println(sum);
    }
}
