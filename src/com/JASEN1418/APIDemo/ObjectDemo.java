package com.JASEN1418.APIDemo;

public class ObjectDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("lisi",19);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));

        Student s4=s3.clone();
        s3.setName("wangmazi");
        System.out.println(s4);
        System.out.println(s3);
    }
}
