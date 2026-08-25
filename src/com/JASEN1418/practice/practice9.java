package com.JASEN1418.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class practice9 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();

        ArrayList list1=new ArrayList();
        ArrayList list2=new ArrayList();
        ArrayList list3=new ArrayList();

        Collections.addAll(list1,"chengdu","guangan","yibin","nanchong");
        Collections.addAll(list2,"piduqu","shuangliu","chenghua","jingniu");
        Collections.addAll(list3,"wushengxian","guanganqu","yuechixian","lishuixian");

        map.put("sichuan",list1);
        map.put("chengdu",list2);
        map.put("guangan",list3);

        map.forEach(( s,  strings)-> {
                StringBuilder str=new StringBuilder();
                str.append(s+" have");
                for (String string : strings) {
                    str.append(string+",");
                }
                System.out.println(str);
            }
        );

    }
}
