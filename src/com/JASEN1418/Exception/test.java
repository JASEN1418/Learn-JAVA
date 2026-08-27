package com.JASEN1418.Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<GirlFriend> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入想要录入的人数");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            while (true) {
                try{
                    sc.nextLine();
                    GirlFriend g=new GirlFriend();
                    System.out.println("请输入姓名（不超过十个字）");
                    String name=sc.nextLine();
                    g.setName(name);
                    System.out.println("请输入合理年龄（18-24）");
                    int age=sc.nextInt();
                    g.setAge(age);
                    list.add(g);
                    break;
                }catch (NameFormatException | AgeOutofBoundsException e){
                    e.printStackTrace();
                    System.out.println("请按下Enter重新输入！");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println(list);
    }
}
