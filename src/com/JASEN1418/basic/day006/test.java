package com.JASEN1418.basic.day006;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("角色一：FeiXue，血量50，最大攻击力20");
        System.out.println("角色二：ChangLi，血量66，最大攻击力14");
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择你的角色");
        int q=sc.nextInt();
        while(q!=1&&q!=2){
            System.out.println("未知英雄，请重新选择！");
            q=sc.nextInt();
        }
        Role a=new Role("FeiXue",50,20);
        Role b=new Role("ChangLi",66,14);
        if(q==2){
            Role c=a;
            a=b;
            b=c;
        }
        System.out.println("电子蛐蛐正式开始：");
        System.out.println("key 1:attach");
        System.out.println("key 2:defense");

        Random ra=new Random();
        while(1==1){
            int p=0;
            System.out.println("目前你的血量："+a.getBlood());
            System.out.println("ChangLi的血量："+b.getBlood());
            int k= sc.nextInt();
            while(k!=1&&k!=2){
                System.out.println("请选择正确的操作！");
                k=sc.nextInt();
            }
            int k2=ra.nextInt(2);
            if(k==1){
                if(k2==1)b.defense(a);
                else p=a.attack(b);
            }
            if(p==1){
                System.out.println("恭喜获胜！");
                break;
            }
            else if(k2==0){
                if(k==2)a.defense(b);
                else if(k==1)p=b.attack(a);
            }
            if(p==1){
                System.out.println("可惜，这次惜败！");
                break;
            }
            else if(k==2&&k2==1){
                System.out.println("无事发生！");
            }
        }
    }
}
