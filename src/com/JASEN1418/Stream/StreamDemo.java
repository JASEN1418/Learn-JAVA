package com.JASEN1418.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","zhaosi","feixue","changli");
        Stream<String> stream=list.stream();
        stream.forEach(s-> System.out.println(s));
        Stream<String> stream1=Stream.of("zhangsan","lisi","wangwu","zhaosi","feixue","changli");
        stream1.forEach(s-> System.out.println(s));
        String[] arr={"zhangsan","lisi","wangwu","zhaosi","feixue","changli"};
        Stream<String> stream2= Arrays.stream(arr);
        stream2.forEach(s-> System.out.println(s));
    }
}
