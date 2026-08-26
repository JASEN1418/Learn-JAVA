package com.JASEN1418.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三-1","李四-2","王五-3","赵六-4","绯雪-5","长离-6");

        //JDk16以上
        //List<String> list=stream.distinct().filter(s -> !s.endsWith("7")).toList();
        //old
        List<String> list1=list.stream().distinct().filter(s -> !s.endsWith("7")).collect(Collectors.toList());
        System.out.println(list1);

        String[] arr=list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

//        Map<String,Integer> map=list.stream().collect(Collectors.toMap(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                String temp=s.split("-")[0];
//                return temp;
//            }
//        }, new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                Integer temp=Integer.parseInt(s.split("-")[1]);
//                return temp;
//            }
//        }));

        //键不能重复，否则报错
        Map<String,Integer> map=list.stream().collect(Collectors.toMap(s -> s.split("-")[0]
        , s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(map);
    }
}
