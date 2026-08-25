package com.JASEN1418.MyCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ImmutableDemo {
    public static void main(String[] args) {
        //不可变集合(即只能查询不能添加和修改
        List<String> list=List.of("zhangsan","lisi","wangwu","feixue");

        Set<String> set=Set.of("abc","qwer","asdf","nm");

        System.out.println(list);

        System.out.println(set);

        System.out.println("----------------");

        //JDK10以后可以用copyof

        List<String> list1=List.copyOf(list);

        Set<String> set1=Set.copyOf(set);

        System.out.println(list1);

        System.out.println(set1);
    }
}
