package com.JASEN1418.basic.day008;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            Student s = new Student();
            System.out.println("请输入姓名：");
            s.setName(sc.nextLine());
            System.out.println("请输入ID:");
            s.setId(sc.nextLine());
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId()+"\t"+list.get(i).getName());
        }
        int p=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("FengXue")){
                p=-1;
                System.out.println("FengXue的ID是："+list.get(i).getId());
            }
        }
        if(p==0) System.out.println("FengXue不存在！");
    }
}
