package com.JASEN1418.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMethodDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","赵六","绯雪","长离","张三");
        //每个Stream流对象只能操作一次

        list.stream().filter(s->!s.startsWith("长")).forEach(s-> System.out.print(s));
        System.out.println("\n==============================");

        //maxSize即长度
        list.stream().limit(4).forEach(s-> System.out.print(s));
        System.out.println("\n==============================");

        //n跳过几个元素
        list.stream().skip(4).forEach(s -> System.out.print(s));
        System.out.println("\n==============================");

        //去重（自定义要重写hashcode和equals
        list.stream().distinct().forEach(s -> System.out.print(s));
        System.out.println("\n==============================");

        Stream.concat(list.stream().distinct().limit(4),list.stream().skip(4)).forEach(s -> System.out.println(s));
        System.out.println("==============================");

        List<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张三-1","李四-2","王五-3","赵六-4","绯雪-5","长离-6","张三-7");
        list1.stream().map(s -> Integer.parseInt(s.substring(3))).forEach(s-> System.out.println(s));

        System.out.println("===============================");
        System.out.println(list.stream().count());
    }
}
