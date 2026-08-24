package com.JASEN1418.MyMap;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class test {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap=new HashMap<Student, String>();

        hashMap.put(new Student("zhangsan",18),"sichuan");
        hashMap.put(new Student("zhangsan",18),"shanghai");
        hashMap.put(new Student("lisi",20),"chongqing");
        hashMap.put(new Student("wangwu",19),"taipei");

        hashMap.forEach((student, s) -> System.out.println(student+" "+s));

    }
}
