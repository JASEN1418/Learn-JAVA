package com.JASEN1418.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class FuctionDemo {
    public static void main(String[] args) {
        /*
            方法引用四大原则
            1.需要有函数式接口
            2.被引用的方法要已经存在
            3.被引用的方法参数和返回值需要与抽象方法保持一致
            4.被引用的方法的功能需要满足当前需求

         */
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6");

        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));

        List<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张三-10","李四-21","王五-23","赵六-24","绯雪-35","长离-60");

        list1.stream().map(Actor::new).forEach(s-> System.out.println(s));

        String[] arr=list1.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
