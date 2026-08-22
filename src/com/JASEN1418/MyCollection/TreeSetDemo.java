package com.JASEN1418.MyCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",19);
        Student s2=new Student("lisi",20);
        Student s3=new Student("wangmazi",18);
        Student s4=new Student("feixue",24);
        Student s5=new Student("changli",23);
        Student s6=new Student("wangwu",20);

        TreeSet<Student> set=new TreeSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        System.out.println(set);

        //可用lambda简化
        TreeSet<Student> nset=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res=o1.getAge()-o2.getAge();
                if(res==0)res=o1.getName().compareTo(o2.getName());
                return res;
            }
        });

        nset.add(s1);
        nset.add(s2);
        nset.add(s3);
        nset.add(s4);
        nset.add(s5);
        nset.add(s6);

        System.out.println(set);
    }
}
