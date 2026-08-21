package com.JASEN1418.MyCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> coll =new ArrayList<>();

        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangmazi",20);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        System.out.println(coll);

        System.out.println(coll.remove(s1));
        System.out.println(coll);

        //如果不是基本数据类型一定要重写equals方法
        //不然还是Object的equals方法  比较内存地址
        System.out.println(coll.contains(s1));

        System.out.println(coll.isEmpty());

        System.out.println(coll.size());

        coll.clear();
        System.out.println(coll.isEmpty());

    }
}
