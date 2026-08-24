package com.JASEN1418.MyMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        //唯一区别为有序，存取顺序一致
        LinkedHashMap<String,String> map=new LinkedHashMap<>();

        map.put("zhangsan","18");
        map.put("lisi","19");
        map.put("wangwu","20");
        map.put("zhangsan","20");

        System.out.println(map);
    }
}
