package com.JASEN1418.MyCollection;

public class tset {
    public static void main(String[] args) {
        Mylist<Student> list=new Mylist<>();
        Student[] s1=new Student[10];
        s1[0]= new Student("zhangsan", 18);
        s1[1]= new Student("lisi", 21);
        s1[2]= new Student("wangmazi", 20);
        list.addAll(s1);
        System.out.println(list);
    }
}
