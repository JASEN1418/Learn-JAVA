package com.JASEN1418.MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();

        map.put("zhangsan","sichuan");
        map.put("lisi","chongqing");
        map.put("wangwu","shanghai");
        map.put("feixue","taipei");
        map.put("changli","shenzhen");

        System.out.println(map);

        Set<Map.Entry<String,String>> set=map.entrySet();

        Map.Entry[] arr1=set.toArray(new Map.Entry[0]);

        Map map1=Map.ofEntries(arr1);
        System.out.println(map1);

        //JDK10以后
        Map map2=Map.copyOf(map);
        System.out.println(map2);
    }
}
