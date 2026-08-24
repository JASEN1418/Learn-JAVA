package com.JASEN1418.MyMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("zhangsan","18");
        map.put("lisi","19");
        map.put("wangwu","20");
        String res1=map.put("zhangsan","20");

        System.out.println(res1);
        System.out.println(map);

        String res2 = map.remove("zhangsan");
        System.out.println(res2);
        System.out.println(map);

        boolean res3=map.containsKey("zhangsan");
        System.out.println(res3);
        boolean res4=map.containsValue("20");
        System.out.println(res4);

        boolean res5=map.isEmpty();
        System.out.println(res5);

        int size=map.size();
        System.out.println(size);

        map.clear();
        System.out.println(map.isEmpty());
        System.out.println("--------------------");

        map.put("zhangsan","18");
        map.put("lisi","19");
        map.put("wangwu","20");

        map.forEach((s, s2) -> System.out.println(s+" "+s2));
        System.out.println("--------------------");
        Set<String> key=map.keySet();
        for (String s : key) {
            String val=map.get(s);
            System.out.println(s+" "+val);
        }
        System.out.println("--------------------");
        Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            String k=it.next();
            System.out.println(k+" "+map.get(k));
        }
        System.out.println("--------------------");

        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getValue()+" "+stringStringEntry.getKey());
        }
        System.out.println("--------------------");


        entrySet.forEach((stringStringEntry)-> System.out.println(stringStringEntry.getValue()+" "+stringStringEntry.getKey()));
        System.out.println("--------------------");

        Iterator<Map.Entry<String,String>> its=map.entrySet().iterator();
        while(its.hasNext()){
            Map.Entry<String,String> entry=its.next();
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    }
}
