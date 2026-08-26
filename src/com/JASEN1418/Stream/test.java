package com.JASEN1418.Stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        Integer[] arr=list.stream().filter(s->s%2==0).toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        ArrayList<String> arrayList=new ArrayList<>();
        String regex=".+[,].+";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想要录入信息的人数");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("按姓名，年龄输入信息");
        for (int i = 0; i < n; i++) {
            String a=sc.nextLine();
            while(!a.matches(regex)||arrayList.contains(a)){
                System.out.println("错误信息，请重新输入");
                a=sc.nextLine();
            }
            arrayList.add(a);
        }
        System.out.println(arrayList);
        Map<String,Integer> map=arrayList.stream().
                filter(s->Integer.parseInt(s.split(",")[1])<=24).
                collect(Collectors.toMap(s -> s.split(",")[0]
                        , s -> Integer.parseInt(s.split(",")[1])));
        map.forEach((s, integer) -> System.out.println(s+" "+integer));

        List<String> manlist=new ArrayList<>();
        List<String> womanlist=new ArrayList<>();
        Collections.addAll(manlist,"张三-24","李四-45","王五-86","赵六-36","张伟-16","长门-18");
        Collections.addAll(womanlist,"绯雪-31","长离-100","心-500","小南-30","小樱-28","雏田-20");

        List<Actor> list1=Stream.concat(womanlist.stream().filter(s->s.split("-")[0].length()==2).
                limit(2),manlist.stream().filter(s->s.startsWith("张")).skip(1)).
                map(s->new Actor(s.split("-")[0],Integer.parseInt(s.split("-")[1]))).
                collect(Collectors.toList());
        System.out.println(list1);

    }
}
