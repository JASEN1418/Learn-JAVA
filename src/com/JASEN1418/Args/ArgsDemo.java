package com.JASEN1418.Args;

public class ArgsDemo {
    public static void main(String[] args) {
        int sum=getsum(1,2,3,4,5,6,7,8,9);
        System.out.println(sum);
    }

    //...可变参数（参数个数不定
    //底层是数组
    public static int getsum(int...args){
        int sum=0;
        for (int i : args) {
            sum+=i;
        }
        return sum;
    }
}
