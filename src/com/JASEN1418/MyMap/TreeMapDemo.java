package com.JASEN1418.MyMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer, String>();

        treeMap.put(1,"zhangsan");
        treeMap.put(5,"feixue");
        treeMap.put(3,"wangwu");
        treeMap.put(2,"lisi");
        treeMap.put(4,"wangmazi");

        System.out.println(treeMap);

        //在Student里面实现Comparable<Student>
        TreeMap<Student,String> treemap=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res=o1.getAge()-o2.getAge();
                res=res==0?res:o1.getName().compareTo(o2.getName());
                return res;
            }
        });

        treemap.put(new Student("zhangsan",18),"sichuan");
        treemap.put(new Student("lisi",20),"chongqing");
        treemap.put(new Student("wangwu",21),"shenzheng");
        treemap.put(new Student("feixue",18),"shanghai");
        treemap.put(new Student("wangmazi",24),"taipei");

        System.out.println(treemap);
    }
}
