package com.JASEN1418.MyCollection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",19);
        Student s2=new Student("lisi",20);
        Student s3=new Student("wangmazi",18);
        Student s4=new Student("feixue",24);
        Student s5=new Student("changli",23);
        Student s6=new Student("wangwu",21);

        HashSet<Student> hash=new HashSet<>();
        hash.add(s1);
        hash.add(s2);
        hash.add(s3);
        hash.add(s4);
        hash.add(s5);
        hash.add(s6);
        hash.add(s6);

        System.out.println(hash);

        //LinkedHashSet就是多了个有序
    }
}
