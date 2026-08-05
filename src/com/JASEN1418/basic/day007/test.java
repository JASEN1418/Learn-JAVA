package com.JASEN1418.basic.day007;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串数字，我可以为你转换成罗马数字");
        String a=sc.nextLine();
        System.out.println("正在转成罗马数字");
        System.out.println("结果为：");
        string str=new string();
        System.out.println(str.repalce(a));
        System.out.println("下面输入两个字符串，我将为你判断B是否由A旋转而来");
        System.out.println("旋转是向字符串整体向左移动");
        String b=sc.nextLine();
        String c=sc.nextLine();
        int p=0;
        if(b.length()!=c.length()) System.out.println("NO！并不是由旋转得来！长度不一致！");
        else{
            for(int i=0;i<b.length();i++){
                if(b.equals(c)){
                    p=1;
                    break;
                }
                b=str.rotate(b);
            }
            if(p==1) System.out.println("Oh,yes!这是由旋转得来的！");
            else System.out.println("No！并不是由旋转得来！内容不一致！");
        }

    }

}
