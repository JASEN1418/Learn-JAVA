package com.JASEN1418.APIDemo;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Student s1=null;
        Student s2=new Student("zhangsan",19);

        //先判断是否为空，更安全
        System.out.println(Objects.equals(s1,s2));

        //判断是否为空，空返回true
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

        //判断是否为空，空返回false
        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
    }
}
